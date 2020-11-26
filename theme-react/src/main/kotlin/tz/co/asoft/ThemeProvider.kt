package tz.co.asoft

import kotlinx.browser.document
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import react.*
import tz.co.asoft.ThemeProvider.Props
import tz.co.asoft.ThemeProvider.State

@JsExport
private class ThemeProvider<I : Any>(p: Props<I>) : RComponent<Props<I>, State<I>>(p), CoroutineScope by CoroutineScope(SupervisorJob()) {
    class Props<I : Any>(
        val observerFrom: StateFlow<ReactTheme<I>>,
        val context: RContext<ReactTheme<I>>,
        val handler: RHandler<RProviderProps<ReactTheme<I>>>
    ) : RProps

    class State<I : Any>(var theme: ReactTheme<I>) : RState

    init {
        state = State(p.observerFrom.value)
    }

    override fun componentDidMount() {
        launch {
            props.observerFrom.collect {
                setState { theme = it }
            }
        }
    }

    override fun componentWillUnmount() {
        cancel()
    }

    override fun RBuilder.render(): dynamic = props.context.Provider(state.theme, props.handler).apply {
        state.theme.imposeToDocument()
    }
}

private fun ReactTheme<*>.imposeToDocument() = document.body?.style?.also {
    it.backgroundColor = backgroundColor.value
    it.color = onBackgroundColor.value
}

fun <I : Any> RBuilder.ThemeProvider(
    observerFrom: StateFlow<ReactTheme<I>>,
    context: RContext<ReactTheme<I>>,
    handler: RHandler<RProviderProps<ReactTheme<I>>>
) = child(ThemeProvider::class.js, Props(observerFrom, context, handler)) {}

fun <I : Any> RBuilder.ThemeProvider(
    theme: ReactTheme<I>,
    context: RContext<ReactTheme<I>>,
    handler: RHandler<RProviderProps<ReactTheme<I>>>
) = context.Provider(theme, handler).apply {
    theme.imposeToDocument()
}
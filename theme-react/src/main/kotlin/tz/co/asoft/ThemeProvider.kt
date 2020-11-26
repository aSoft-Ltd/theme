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
private class ThemeProvider(p: Props) : RComponent<Props, State>(p), CoroutineScope by CoroutineScope(SupervisorJob()) {
    class Props(
        val observerFrom: StateFlow<ReactTheme>,
        val context: RContext<ReactTheme>,
        val handler: RHandler<RProviderProps<ReactTheme>>
    ) : RProps

    class State(var theme: ReactTheme) : RState

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

private fun ReactTheme.imposeToDocument() = document.body?.style?.also {
    it.backgroundColor = backgroundColor.value
    it.color = onBackgroundColor.value
}

fun <I : Any> RBuilder.ThemeProvider(
    observerFrom: StateFlow<ReactTheme>,
    handler: RHandler<RProviderProps<ReactTheme>>
) = child(ThemeProvider::class.js, Props(observerFrom, ThemeContext, handler)) {}

fun <I : Any> RBuilder.ThemeProvider(
    theme: ReactTheme,
    handler: RHandler<RProviderProps<ReactTheme>>
) = ThemeContext.Provider(theme, handler).apply {
    theme.imposeToDocument()
}
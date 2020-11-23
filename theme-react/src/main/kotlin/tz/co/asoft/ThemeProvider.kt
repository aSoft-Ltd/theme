package tz.co.asoft

import kotlinx.browser.document
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import react.*

private class ThemeProvider(p: Props) : RComponent<ThemeProvider.Props, ThemeProvider.State>(p), CoroutineScope by CoroutineScope(SupervisorJob()) {
    class Props(
        val observerFrom: StateFlow<ReactTheme>,
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

    override fun RBuilder.render(): dynamic = ThemeContext.Provider(state.theme, props.handler).apply {
        state.theme.imposeToDocument()
    }
}

private fun ReactTheme.imposeToDocument() = document.body?.style?.also {
    it.backgroundColor = backgroundColor.value
    it.color = onBackgroundColor.value
}

fun RBuilder.ThemeProvider(
    observerFrom: StateFlow<ReactTheme> = currentTheme,
    handler: RHandler<RProviderProps<ReactTheme>>
) = child(ThemeProvider::class.js, ThemeProvider.Props(observerFrom, handler)) {}

fun RBuilder.ThemeProvider(
    theme: ReactTheme,
    handler: RHandler<RProviderProps<ReactTheme>>
) = ThemeContext.Provider(theme, handler).apply {
    theme.imposeToDocument()
}
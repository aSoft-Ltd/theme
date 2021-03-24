package theme

import kotlinx.browser.document
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import react.*
import theme.ThemeProvider.Props
import theme.ThemeProvider.State

@JsExport
class ThemeProvider(p: Props) : RComponent<Props, State>(p), CoroutineScope by CoroutineScope(SupervisorJob()) {
    class Props(val observerFrom: StateFlow<ReactTheme>) : RProps

    class State(var theme: ReactTheme) : RState

    init {
        state = State(p.observerFrom.value)
    }

    override fun componentDidMount(): dynamic = launch {
        props.observerFrom.collect {
            it.imposeToDocument()
            setState { theme = it }
        }
    }

    override fun componentWillUnmount(): dynamic = cancel()

    override fun RBuilder.render(): dynamic = ThemeProvider(state.theme) { props.children() }
}

private fun ReactTheme.imposeToDocument() = document.body?.style?.also {
    it.backgroundColor = backgroundColor.value
    it.color = onBackgroundColor.value
}

fun RBuilder.ThemeProvider(
    theme: ReactTheme,
    handler: RHandler<RProviderProps<ReactTheme>>
) = ThemeContext.Provider(theme, handler)

fun RBuilder.ThemeProvider(
    observerFrom: StateFlow<ReactTheme> = currentTheme,
    handler: RBuilder.() -> Unit
) = child(ThemeProvider::class.js, Props(observerFrom), handler)


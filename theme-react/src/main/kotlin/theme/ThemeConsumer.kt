package theme

import react.RBuilder
import react.createContext

val ThemeContext by lazy { createContext(currentTheme.value) }

inline fun RBuilder.ThemeConsumer(noinline handler: RBuilder.(ReactTheme) -> Unit) = ThemeContext.Consumer(handler)

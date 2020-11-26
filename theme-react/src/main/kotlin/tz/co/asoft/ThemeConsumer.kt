package tz.co.asoft

import react.RBuilder
import react.createContext

val ThemeContext by lazy { createContext(currentTheme.value) }

fun RBuilder.ThemeConsumer(handler: RBuilder.(ReactTheme) -> Unit) = ThemeContext.Consumer(handler)

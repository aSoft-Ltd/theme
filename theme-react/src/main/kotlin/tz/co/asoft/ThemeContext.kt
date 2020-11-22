package tz.co.asoft

import kotlinx.coroutines.flow.MutableStateFlow
import react.RBuilder
import react.createContext

val currentTheme by lazy { MutableStateFlow(AquaGreenTheme) }

val ThemeContext by lazy { createContext(currentTheme.value) }

fun RBuilder.ThemeConsumer(handler: RBuilder.(Theme<Typography>) -> Unit) = ThemeContext.Consumer(handler)

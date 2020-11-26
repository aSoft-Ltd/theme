package tz.co.asoft

import kotlinx.coroutines.flow.MutableStateFlow

val currentTheme by lazy { MutableStateFlow(AquaGreenTheme()) }
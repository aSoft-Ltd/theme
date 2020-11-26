package tz.co.asoft

fun <I : Any> AquaGreenTheme(typography: Typography? = null, icon: I? = null) = Theme(
    name = "aQua Green",
    color = AquaGreenPallet,
    text = typography ?: Typography(),
    icon = icon ?: Unit
)
package tz.co.asoft

fun AquaGreenTheme(typography: Typography? = null) = Theme(
    name = "aQua Green [${typography?.name ?: "default"}]",
    color = AquaGreenPallet,
    text = typography ?: Typography(),
)
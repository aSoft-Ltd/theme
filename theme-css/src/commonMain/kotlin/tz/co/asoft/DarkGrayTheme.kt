package tz.co.asoft

fun DarkGrayTheme(typography: Typography? = null) = Theme(
    name = "Dark Gray [${typography?.name ?: "default"}]",
    color = DarkGrayPallet,
    text = typography ?: Typography(),
)
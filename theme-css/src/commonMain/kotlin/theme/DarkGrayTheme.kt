package theme

import theme.palletes.DarkGrayPallet

fun DarkGrayTheme(typography: Typography? = null) = Theme(
    name = "Dark Gray [${typography?.name ?: "default"}]",
    color = DarkGrayPallet,
    text = typography ?: Typography(),
)
package tz.co.asoft

fun <I : Any> DarkGrayTheme(icon: I) = Theme(
    name = "Dark Gray",
    color = DarkGrayPallet,
    text = Typography(),
    icon = icon
)

fun DarkGrayTheme() = Theme(
    name = "Dark Gray",
    color = DarkGrayPallet,
    text = Typography(),
    icon = Unit
)
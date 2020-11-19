package tz.co.asoft

import kotlinx.css.rem
import tz.co.asoft.TextStyle

actual class Typography constructor(
    val h1: TextStyle = TextStyle(2.rem),
    val h2: TextStyle = TextStyle(1.5.rem),
    val h3: TextStyle = TextStyle(1.17.rem),
    val h4: TextStyle = TextStyle(1.0.rem),
    val h5: TextStyle = TextStyle(0.83.rem),
    val h6: TextStyle = TextStyle(0.67.rem),
    val subtitle1: TextStyle = TextStyle(
        1.25.rem
    ),
    val subtitle2: TextStyle = TextStyle(
        1.15.rem
    ),
    val body1: TextStyle = TextStyle(
        1.0.rem
    ),
    val body2: TextStyle = TextStyle(
        1.0.rem
    ),
    val button: TextStyle = TextStyle(
        1.0.rem
    ),
    val caption: TextStyle = TextStyle(
        0.9.rem
    ),
    val overline: TextStyle = TextStyle(
        0.9.rem
    )
)
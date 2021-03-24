package theme

import kotlinx.css.rem

data class Typography(
    val name: String = "Basic",
    val h1: TextStyle = TextStyle(fontSize = 2.rem),
    val h2: TextStyle = TextStyle(fontSize = 1.5.rem),
    val h3: TextStyle = TextStyle(fontSize = 1.17.rem),
    val h4: TextStyle = TextStyle(fontSize = 1.0.rem),
    val h5: TextStyle = TextStyle(fontSize = 0.83.rem),
    val h6: TextStyle = TextStyle(fontSize = 0.67.rem),
    val subtitle1: TextStyle = TextStyle(fontSize = 1.25.rem),
    val subtitle2: TextStyle = TextStyle(fontSize = 1.15.rem),
    val body1: TextStyle = TextStyle(fontSize = 1.0.rem),
    val body2: TextStyle = TextStyle(fontSize = 1.0.rem),
    val button: TextStyle = TextStyle(fontSize = 1.0.rem),
    val caption: TextStyle = TextStyle(fontSize = 0.9.rem),
    val overline: TextStyle = TextStyle(fontSize = 0.9.rem)
)
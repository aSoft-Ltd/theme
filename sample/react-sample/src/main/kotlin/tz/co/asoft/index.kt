package tz.co.asoft

import kotlinx.browser.document
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.render
import styled.css
import styled.styledButton
import theme.*
import theme.palletes.DarkGrayPallet

fun main() {
    currentTheme.value = AquaGreenTheme()
    render(document.getElementById("root")) {
        console.log(ThemeContext)
        ThemeProvider {
            div { +"Works" }
            ThemeConsumer { th -> Button(th) }
            ThemeConsumer { theme ->
                div {
                    +"Working with ${theme.name}"
                    ThemeProvider(AquaGreenTheme()) {
                        ThemeConsumer { Button(it) }
                    }
                    +"And now with ${theme.name}"
                }
            }
        }
    }
}

private fun RBuilder.Button(th: ReactTheme) = styledButton {
    css {
        width = 100.px
        padding(0.5.em)
        backgroundColor = th.primaryColor
        color = th.onPrimaryColor
    }
    attrs.onClickFunction = {
        currentTheme.value = if (currentTheme.value.color == DarkGrayPallet) {
            AquaGreenTheme()
        } else {
            DarkGrayTheme()
        }
    }
    +"Change Theme"
}
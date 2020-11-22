# aSoft Theme
![badge][badge-maven] ![badge][badge-mpp] ![badge][badge-android] ![badge][badge-js] ![badge][badge-jvm]

A kotlin multiplatform theme engine

## Introduction
Ever wanted to define your theme once and port it to different platforms? This is the way

## Samples
Define your ColorPalette in multiplatform code
```kotlin
val AquaGreenPallet = ColorPalette(
    primary = Color(0xFF0E9B8A),
    primaryVariant = Color(0xFF006C5D),
    onPrimary = Color(0xFFDADADA),
    secondary = Color(0xFF12AC97),
    secondaryVariant = Color(0xFF007C69),
    onSecondary = Color(0xFF121212),
    background = Color(0xFFF5F5F5),
    onBackground = Color(0xFF121212),
    backgroundVariant = Color(0xFF006C5D),
    onBackgroundVariant = Color(0xFFDADADA),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF121212),
    error = Color(0xFFA82D2D),
    onError = Color(0xFF121212),
    isLight = true
)
```
then declare/choose your typography
```kotlin
val myTypography = Typography(
    h1 = TextStyle(fontSize = 2.rem),
    h2 = TextStyle(fontSize = 1.5.rem),
    h3 = TextStyle(fontSize = 1.17.rem),
    h4 = TextStyle(fontSize = 1.0.rem),
    h5 = TextStyle(fontSize = 0.83.rem),
    h6 = TextStyle(fontSize = 0.67.rem),
    subtitle1 = TextStyle(fontSize = 1.25.rem),
    subtitle2 = TextStyle(fontSize = 1.15.rem),
    body1 = TextStyle(fontSize = 1.0.rem),
    body2 = TextStyle(fontSize = 1.0.rem),
    button = TextStyle(fontSize = 1.0.rem),
    caption = TextStyle(fontSize = 0.9.rem),
    overline = TextStyle(fontSize = 0.9.rem)
)
```

Then declare your theme
```kotlin
val AquaGreenTheme = Theme(
    name = "aQua Green",
    color = AquaGreenPallet,
    text = Typography()
)
```
## Setup:Gradle
```kotlin
dependencies {
    implementation("tz.co.asoft:theme-core:+") // please use the latest version possible
}
```

## Default Themes
The engine comes with 2 default `ColorPalette` and a default `Typography` per platform/framework/library
### AquaGreenTheme
The values are set as shown on the code above

### DarkGrayTheme
Whose color palette is as bellow
```kotlin
val DarkGrayPallet = ColorPalette(
    primary = Color(0xFF1F3D4C),
    primaryVariant = Color(0xFF455A64),
    onPrimary = Color(0xFFDADADA),
    secondary = Color(0xFF12AC97),
    secondaryVariant = Color(0xFF007C69),
    onSecondary = Color(0xFF121212),
    background = Color(0xFF080808),
    onBackground = Color(0xFFFFFFFF),
    backgroundVariant = Color(0xFF121212),
    onBackgroundVariant = Color(0xFFFFFFFF),
    surface = Color(0xFF17181A),
    onSurface = Color(0xFFFFFFFF),
    error = Color(0xFFA82D2D),
    onError = Color(0xFF121212),
    isLight = false
)
``` 

### ColorPalette Extensions
While you can craft your own themes, you'll often need to just extend a theme. You can do it simply just like
```kotlin
val PaleGreenPalette = AquaGreenPalette.copy(
    primary = Color(0xFF98FB98)
)
```

### Using with kotlin-react
A react specific artifact is available for targeting `kotlin-react` specifically
#### Sample
```kotlin
    fun RBuilder.TestComp(myTheme: ReactTheme) = ThemeProvider(myTheme) { 
        div {
            +"Test sample"
        }
        ThemeConsumer{theme->
            h1 {
               attrs["background"] = theme.color.primary() 
            }
        }
    }
```
#### Setup: Gradle
```kotlin
dependencies {
    implementation("tz.co.asoft:theme-react:+") // please use the latest version possible
}
```

### Comming Soon
#### Theme Compose
We are working on porting the theme lib to jetpack compose as well, that way you can have one theme on web, android and desktop

[badge-maven]: https://img.shields.io/maven-central/v/tz.co.asoft/test/1.0.1?style=flat
[badge-mpp]: https://img.shields.io/badge/kotlin-multiplatform-blue?style=flat
[badge-android]: http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat
[badge-js]: http://img.shields.io/badge/platform-js-yellow.svg?style=flat
[badge-jvm]: http://img.shields.io/badge/platform-jvm-orange.svg?style=flat

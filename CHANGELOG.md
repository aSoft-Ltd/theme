# 0.0.4 : 2020.11.27
## Bug fixes
- Fixed not supporting IR backend

# 0.0.3 : 2020.11.26
## Enhancements
- Removed Iconography as it makes the syntax cumbersome

# 0.0.2 : 2020.11.26
## Bug Fixes
- Marked ThemeProvider with @JsExport to allow proper DCE

## New Artifacts
- Added `theme-css` supporting jvm and js

## New Features
- Added Iconography to theme

## Dependencies
- updated kotlin to version 1.4.20

# 0.0.1
## Availability
- Published to maven central

## Build Src
- Updated to gradle version 6.7.1

## New Features
### theme-core-metadata
- Added `ColorPallet` class
- Added `Theme<T>` class

### theme-core-js
- Added `TextStyle` class for any web framework
- Added `Typograpgy` class for any web framework
- Added `operator fun Color.invoke()` to make it easy convert to CSS colors

### theme-react
- Added `TextStyle`
- Added `ReactTheme` type alias of `Theme<Typography>`
- Added `ThemeContext`
- Added `fun RBuilder.ThemeProvider(...)`
- Added `fun RBuilder.ThemeConsumer(...)`

## Documentation
- Update readme

## Samples
- Added samples
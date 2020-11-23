plugins {
    kotlin("js")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    js(IR) {
        browser()
    }
}

dependencies {
    api(project(":theme-core"))
    api("org.jetbrains:kotlin-react:${vers.wrappers.react}")
}

aSoftLibrary(
    version = vers.asoft.theme,
    description = "A theme engine for kotlin/react"
)

plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    jvm { targetJava("1.8") }
    js(IR) {
        browser {}
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":theme-core"))
                api("org.jetbrains:kotlin-css:${vers.wrappers.css}")
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft.theme,
    description = "A platform/framework agnostic theme engine"
)
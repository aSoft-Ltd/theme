plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(asoft("color-core", vers.asoft.color))
            }
        }
        val commonTest by getting {
            dependencies {
                api(asoft("test", "1.0.1"))
            }
        }
        val jsMain by getting {
            dependencies {
                api("org.jetbrains:kotlin-css-js:${vers.wrappers.css}")
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft.theme,
    description = "A platform/framework agnostic theme engine"
)
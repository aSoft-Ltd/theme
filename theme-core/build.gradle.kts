plugins {
    id("com.android.library") version "4.1.0"
    kotlin("multiplatform") version "1.4.10"
    id("tz.co.asoft.library") version "0.0.7"
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

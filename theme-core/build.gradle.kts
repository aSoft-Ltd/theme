plugins {
    id("com.android.library") version "4.1.0"
    kotlin("multiplatform") version "1.4.10"
    id("tz.co.asoft.library") version "0.0.7"
}


kotlin{
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            dependencies {
                api(asoft("test","1.0.1"))
            }
        }

        val androidMain by getting {
            dependencies {
                api(kotlin("stdlib"))
                api("androidx.ui:ui-material:${versions.androidx.ui}")
                api("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${versions.kotlinx.serialization}")
            }
        }

        val jvmMain by getting {
            dependencies {
                api(kotlin("stdlib"))
            }
        }

        val jsMain by getting {
            dependencies {
                api(kotlin("stdlib-js"))
                api("org.jetbrains:kotlin-css-js:${versions.kotlinjs.css}")
            }
        }
    }
}

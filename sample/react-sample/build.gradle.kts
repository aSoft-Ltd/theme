plugins {
    kotlin("js")
    id("tz.co.asoft.applikation")
}

applikation {
    debug()
    release()
}

kotlin {
    js(IR) { application() }
    sourceSets {
        val main by getting {
            dependencies {
                implementation(project(":theme-react"))
                implementation("org.jetbrains:kotlin-react-dom:${vers.wrappers.react}")
                implementation("org.jetbrains:kotlin-styled:${vers.wrappers.styled}")
            }
        }
    }
}

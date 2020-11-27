plugins {
    kotlin("js")
    id("tz.co.asoft.application")
}

konfig {
    debug()
    release()
}

repositories {
    publicRepos()
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
}

dependencies {
    implementation(project(":theme-react"))
    implementation("org.jetbrains:kotlin-react-dom:${vers.wrappers.react}")
    implementation("org.jetbrains:kotlin-styled:${vers.wrappers.styled}")
}

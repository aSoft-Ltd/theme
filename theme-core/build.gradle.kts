plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    multiplatformLib()
    val darwinTargets = listOf(
        macosX64(),
        iosArm64(),
        iosArm32(),
        iosX64(),
        watchosArm32(),
        watchosArm64(),
        watchosX86(),
        tvosArm64(),
        tvosX64()
    )

    val linuxTargets = listOf(
        linuxX64(),
        linuxArm64(),
        linuxArm32Hfp()
    )
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(asoft("color-core", vers.asoft.color))
            }
        }
        val commonTest by getting {
            dependencies {
                api(asoft("test-core", vers.asoft.test))
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.theme,
    description = "A platform/framework agnostic theme engine"
)
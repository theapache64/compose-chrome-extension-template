// Add compose gradle plugin
plugins {
    kotlin("multiplatform") version "1.9.25"
    id("org.jetbrains.compose") version "1.7.3"
}
group = "com.composeweb.chrome"
version = "1.0.0-alpha01"

// Add maven repositories
repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
    }
}

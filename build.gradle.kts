plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
    kotlin("multiplatform") version "1.6.21"
}

repositories {
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}
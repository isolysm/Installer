plugins {
    'kotlin-dsl'
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.6.21"))
    implementation(kotlin("serialization", version = "1.6.21"))
    implementation(gradleApi())
    implementation(localGroovy())
}
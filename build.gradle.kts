plugins {
    kotlin("jvm") version "2.1.21"
}

kotlin {
    jvmToolchain(17)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.21.1")
}

tasks.test {
    useJUnitPlatform()
}

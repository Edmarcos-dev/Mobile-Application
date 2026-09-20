plugins {
    alias(ktorLibs.plugins.ktor)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

group = "com.onlineStoreMobile"
version = "0.0.1"

application {
    mainClass.set("com.onlineStoreMobile.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.5.2")
    implementation("io.ktor:ktor-server-netty-jvm:3.5.2")
    implementation("io.ktor:ktor-server-config-yaml:3.5.2")
    implementation("io.ktor:ktor-server-content-negotiation:3.5.2")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.5.2")
    implementation(libs.logback.classic)

    implementation(libs.h2database.h2)
    implementation(libs.postgresql)

    testImplementation("io.ktor:ktor-server-test-host-jvm:3.5.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
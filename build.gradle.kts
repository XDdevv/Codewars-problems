plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.13.1")
    testImplementation("com.willowtreeapps.assertk:assertk:0.28.1")
}

tasks.test {
    useJUnitPlatform()
}
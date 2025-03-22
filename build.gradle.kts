import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
    maven {
        url = uri("https://company/com/maven2")
    }
    mavenLocal()
    flatDir {
        dirs("libs")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(":mnist-tools:")
    implementation("com.google.code.gson:gson:2.2.4")
    files("libs/mnist-tools.jar', 'libs/gson-2.2.4.jar")
}

tasks.test {
    useJUnitPlatform()
}


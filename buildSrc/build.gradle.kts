plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven("https://jitpack.io")
}

allprojects {
    repositories {
        google()
        mavenCentral()

        maven("https://maven.localazy.com/repository/release/")
        maven("https://jitpack.io")
        maven("https://cardinalcommerceprod.jfrog.io/artifactory/android") {
            credentials {
                username = "paypal_sgerritz"
                password =
                    "AKCp8jQ8tAahqpT5JjZ4FRP2mW7GMoFZ674kGqHmupTesKeAY2G8NcmPKLuTxTGkKjDLRzDUQ"
            }
        }

    }
}


dependencies {
    implementation("de.fayard.refreshVersions:refreshVersions:0.40.1")
    implementation("com.android.tools.build:gradle:7.1.3")
//    implementation(kotlin("gradle-plugin", "1.5.31"))
    implementation(kotlin("gradle-plugin", "1.6.10"))
    implementation(gradleApi())
    implementation(localGroovy())
}



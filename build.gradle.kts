buildscript {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        maven("https://maven.localazy.com/repository/release/")
        maven("https://jitpack.io")

    }


    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:_")

        classpath(Google.playServicesGradlePlugin) // Google Services plugin

        classpath(Google.dagger.hilt.android.gradlePlugin)
        classpath(AndroidX.navigation.safeArgsGradlePlugin) // Navigation Architecture Component

    }
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

task("clean") {
    delete(rootProject.buildDir)
}

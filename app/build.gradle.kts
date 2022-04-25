plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}


android {
    configCommon()
    defaultConfig {
        applicationId = "com.ticonsys.chabiwal"
        versionCode = 1
        versionName = "1.0.0"

        ndk {
            abiFilters.addAll(arrayOf("armeabi-v7a", "arm64-v8a", "x86", "x86_64"))
        }
        resourceConfigurations.addAll(arrayOf("en"))
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    hilt {
        enableAggregatingTask = false
    }

}

setupCommonDependencies()

dependencies {

    useCompose()
    useNavigation()
    useRoom()
    useHilt()
//    useExoplayer()


//    implementation("androidx.paging:paging-compose:1.0.0-alpha14")
    implementation(AndroidX.paging.compose)
    implementation(Google.accompanist.pager)
    implementation(Google.accompanist.pager.indicators)
    implementation(Google.accompanist.flowlayout)
    implementation(Google.android.playServices.auth)



    implementation(Square.okHttp3.okHttp)
    implementation(Square.okHttp3.loggingInterceptor)
    implementation(Square.retrofit2.retrofit)
    implementation(Square.retrofit2.adapter.rxJava2)
    implementation(Square.retrofit2.converter.gson)
    implementation(Square.retrofit2.converter.scalars)
    implementation(Square.okio)

    implementation(DepUtils.coil)
    implementation(DepUtils.coilAccompanist)
    implementation(DepUtils.coilImage)


    implementation("com.jakewharton.timber:timber:_")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:_")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:_")

}
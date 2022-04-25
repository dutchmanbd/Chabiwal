import org.gradle.kotlin.dsl.DependencyHandlerScope


fun DependencyHandlerScope.implementation(dependencyNotation: Any) {
    add("implementation", dependencyNotation)
}

fun DependencyHandlerScope.kapt(dependencyNotation: Any) {
    add("kapt", dependencyNotation)
}

fun DependencyHandlerScope.useNavigation() {
    implementation(AndroidX.navigation.commonKtx)
    implementation(AndroidX.navigation.fragmentKtx)
    implementation(AndroidX.navigation.uiKtx)
    implementation(AndroidX.navigation.runtimeKtx)
}

fun DependencyHandlerScope.useHilt() {
    implementation(Google.dagger.hilt.android)
    kapt(Google.dagger.hilt.compiler)
    implementation(AndroidX.hilt.navigationFragment)
    implementation(AndroidX.hilt.navigationCompose)
}

fun DependencyHandlerScope.useRoom() {
    implementation(AndroidX.room.runtime)
    kapt(AndroidX.room.compiler)
    implementation(AndroidX.room.ktx)
}

fun DependencyHandlerScope.useExoplayer() {
    implementation(Exoplayer.player)
    implementation(Exoplayer.core)
    implementation(Exoplayer.dash)
    implementation(Exoplayer.smoothStreaming)
    implementation(Exoplayer.hls)
    implementation(Exoplayer.ui)
    implementation(Exoplayer.rtsp)
}

fun DependencyHandlerScope.useCompose() {
    implementation(AndroidX.core.ktx)
    implementation(AndroidX.lifecycle.viewModelKtx)
    implementation(AndroidX.lifecycle.runtimeKtx)
    implementation(AndroidX.lifecycle.viewModelCompose)

    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.ui.geometry)
    implementation(AndroidX.compose.ui.graphics)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.ui.toolingPreview)
    implementation(AndroidX.compose.ui.toolingData)

    implementation(AndroidX.compose.animation)
    implementation(AndroidX.compose.animation.core)

    implementation(AndroidX.compose.material)
    implementation(AndroidX.compose.material.icons.core)
    implementation(AndroidX.compose.material.icons.extended)

    implementation(AndroidX.compose.runtime.liveData)
    implementation(AndroidX.activity.compose)

    implementation(AndroidX.navigation.compose)
    implementation(AndroidX.constraintLayout.compose)

}

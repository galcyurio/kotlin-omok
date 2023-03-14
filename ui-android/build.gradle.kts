plugins {
    id("omok.android-app-conventions")
}

android {
    namespace = "com.github.galcyurio.omok"

    defaultConfig {
        applicationId = "com.github.galcyurio.omok"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
}

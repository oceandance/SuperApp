plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = "../../android_feature_dependencies.gradle")

android {

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        isEnabled = true
    }

}

dependencies {
    implementation(project(kz.oceandance.buildsrc.Modules.featureHome))
    implementation(project(kz.oceandance.buildsrc.Modules.featureNews))

}

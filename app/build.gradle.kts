plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.piegeon"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.piegeon"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        dataBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Core and AndroidX libraries
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1100)


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.lottie)

    // Lifecycle components
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.androidx.lifecycle.common.java8)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // Firebase dependencies
    implementation(libs.firebase.firestore) // Updated version
    implementation(libs.firebase.firestore.ktx) // Updated version
    implementation(libs.firebase.auth) // Updated version
    implementation(libs.firebase.auth.ktx) // Updated version
    implementation(libs.firebase.storage) // Updated version
    implementation(libs.firebase.messaging) // Updated version
    implementation(libs.firebase.installations) // Updated version

    // Navigation components
    implementation(libs.androidx.navigation.fragment.ktx) // Updated version
    implementation(libs.androidx.navigation.ui.ktx) // Updated version

    // Glide for image loading
    implementation(libs.glide)


    // Circle Image View for profile pictures
    implementation(libs.circleimageview)

    // Kotlin standard library
    implementation(libs.kotlin.stdlib.jdk8)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    // Material EditText
    implementation(libs.library)

    // Retrofit for networking
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()

    }
    dependencies {
        classpath (libs.gradle)
        classpath (libs.kotlin.gradle.plugin)
        classpath (libs.androidx.navigation.safe.args.gradle.plugin)
        classpath (libs.google.services)


    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
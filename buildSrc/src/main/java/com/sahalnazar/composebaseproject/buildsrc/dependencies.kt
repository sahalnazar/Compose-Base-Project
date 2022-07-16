package com.sahalnazar.composebaseproject.buildsrc

object Versions {
    const val jsonSerialization = "1.3.2"
    const val dagger = "2.40.1"
    const val hilt = "1.0.0"
    const val accompanist = "0.24.13-rc"
    const val kotlin = "1.6.10"
    const val coroutines = "1.6.0"
    const val junit = "4.13"
    const val coil = "2.0.0"
    const val composeVersion = "1.1.1"
    const val composeCompilerVersion = "1.2.0"
    const val lifeCycle = "2.4.1"
    const val room = "2.5.0-alpha02"
    const val okHttp = "4.10.0"
    const val serializationConverter = "0.8.0"
    const val timber = "5.0.1"
    const val dataStore = "1.0.0"

}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.2.1"

    object Accompanist {
        const val pager = "com.google.accompanist:accompanist-pager:${Versions.accompanist}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"

    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object JUnit {
        const val junit = "junit:junit:$${Versions.junit}"
    }

    const val appcompat = "androidx.appcompat:appcompat:1.4.1"
    const val palette = "androidx.palette:palette:1.0.0"
    const val coreKtx = "androidx.core:core-ktx:1.7.0"
    const val activityCompose = "androidx.activity:activity-compose:1.4.0"

    object Compose {
        const val runtime = "androidx.compose.runtime:runtime:${Versions.composeVersion}"
        const val foundation = "androidx.compose.foundation:foundation:${Versions.composeVersion}"
        const val layout = "androidx.compose.foundation:foundation-layout:${Versions.composeVersion}"

        const val ui = "androidx.compose.ui:ui:${Versions.composeVersion}"
        const val material = "androidx.compose.material:material:${Versions.composeVersion}"
        const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.composeVersion}"

        const val tooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    }

    object Lifecycle {
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}"
        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifeCycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
    }

    object Navigation {
        const val navigation = "androidx.navigation:navigation-compose:2.4.2"
    }


    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val ktx = "androidx.room:room-ktx:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object Hilt {
        const val dagger = "com.google.dagger:hilt-android:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"

        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hilt}"
        const val hiltComposeNav = "androidx.hilt:hilt-navigation-compose:${Versions.hilt}"
    }

    object JsonSerialization {
        const val jsonSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.jsonSerialization}"
    }

    object Retrofit {
        const val okhttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttp}"
        const val okhttp = "com.squareup.okhttp3:okhttp"
        const val okhttpLogInterceptor = "com.squareup.okhttp3:logging-interceptor"

        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val serializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.serializationConverter}"
    }


    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Timber {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    object DataStore {
        const val dataStore = "androidx.datastore:datastore-preferences:${Versions.dataStore}"
    }
}


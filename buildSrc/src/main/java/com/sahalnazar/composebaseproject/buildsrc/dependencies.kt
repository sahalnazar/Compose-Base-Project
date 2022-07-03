package com.sahalnazar.composebaseproject.buildsrc

object Versions {
    const val accompanist = "0.24.13-rc"
    const val kotlin = "1.7.0"
    const val coroutines = "1.6.0"
    const val okHttp = "4.9.1"
    const val junit = "4.13"
    const val coil: String = "2.0.0"
    const val compose: String = "1.1.1"
    const val lifeCycle: String = "2.4.1"
    const val room = "2.5.0-alpha02"
    const val gradle = "7.3.3"
}

object Libs {

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

    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    }

    object JUnit {
        const val junit = "junit:junit:$${Versions.junit}"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.1"
        const val palette = "androidx.palette:palette:1.0.0"
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val activityCompose = "androidx.activity:activity-compose:1.4.0"

        object Compose {
            const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
            const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
            const val layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"

            const val ui = "androidx.compose.ui:ui:${Versions.compose}"
            const val material = "androidx.compose.material:material:${Versions.compose}"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"

            const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        }

        object Lifecycle {
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifeCycle}"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
        }

        object Navigation {
            const val navigation = "androidx.navigation:navigation-compose:2.4.2"
        }


        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.room}"
        }

    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"
    }
}

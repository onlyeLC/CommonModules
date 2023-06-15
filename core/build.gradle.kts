plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.onlye.core"
    compileSdk = ProjectConfig.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectConfig.MIN_SDK
        targetSdk = ProjectConfig.TARGET_SDK

        testInstrumentationRunner = ProjectConfig.ANDROID_JUNIT_RUNNER
        consumerProguardFiles(ProjectConfig.CONSUMER_PROGUARD_FILES)
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
        jvmTarget = ProjectConfig.JVM_TARGET
    }
}

dependencies {
    //android 基础api
    api(Libs.androidxCore)
    api(Libs.androidxAppcompat)
    api(Libs.material)
    api(Libs.constraintlayout)
    testApi(Libs.junit)
    androidTestApi(Libs.androidxJunit)
    androidTestApi(Libs.espressoCore)

    //基础组件
    api(project(mapOf("path" to ":base_permission")))
    api(project(mapOf("path" to ":base_network")))
    api(project(mapOf("path" to ":base_img")))
    api(project(mapOf("path" to ":base_ui")))
}
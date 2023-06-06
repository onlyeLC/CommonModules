plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.onlye.base_img"
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
    api(Libs.glide)
    // TODO: 使用KSP代替annotationProcessor
    annotationProcessor(Libs.glide_compiler)
}
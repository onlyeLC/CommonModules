/**
 * @author: onlye
 * @description:
 * @date :2023/5/27 1:13
 * @version:
 * @email: 986289773@qq.com
 */

object Version {
    const val retrofit_version = "2.9.0"
    const val okhttp_version = "4.11.0"
    const val permissionx_version = "1.7.1"
    const val androidx_core_version = "1.9.0"
    const val androidx_appcompat_version = "1.6.1"
    const val material_version = "1.7.0"
    const val constraintlayout_version = "2.1.4"
    const val junit_version = "4.13.2"
    const val androidx_junit_version = "1.1.3"
    const val espresso_core_version = "3.4.0"
}

object Libs {
    /**
     * 基础SDK
     */
    const val androidxCore = "androidx.core:core-ktx:${Version.androidx_core_version}"
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Version.androidx_appcompat_version}"
    const val material = "com.google.android.material:material:${Version.material_version}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Version.constraintlayout_version}"
    const val junit = "junit:junit:${Version.junit_version}"
    const val androidxJunit = "androidx.test.ext:junit:${Version.androidx_junit_version}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espresso_core_version}"

    /**
     * 网络SDK:Retrofit、okhttp、
     */
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit_version}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit_version}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttp_version}"
    /**
     *权限框架SDK
     */
    const val permissionX = "com.guolindev.permissionx:permissionx:${Version.permissionx_version}"
}




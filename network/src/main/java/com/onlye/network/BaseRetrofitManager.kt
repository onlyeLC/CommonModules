package com.onlye.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author: onlye
 * @description: Retrofit基础配置类，需要自定义配置则继承当前类
 * @date :2023/5/26 0:16
 * @version:
 * @email: 986289773@qq.com
 */
private const val TIME_OUT_LENGTH: Long = 10L

private const val BASE_URL = "https://www.wanandroid.com/"

abstract class BaseRetrofitManager {

    private val okHttpClient: OkHttpClient by lazy {
        val builder = OkHttpClient.Builder()
            .callTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
        customOkHttpClientBuilder(builder)
        builder.build()
    }

     private val retrofit:Retrofit by lazy {
        val build = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
        customRetrofitClientBuilder(build)
        build.build()
    }


    inline fun <reified T> create(): T {
        return create(T::class.java)
    }


    fun <T> create(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }

    /**
     * 自定义OkHttpClient，添加日志拦截器等
     */
    abstract fun customOkHttpClientBuilder(builder: OkHttpClient.Builder)

    /**
     * 自定义RetrofitClient
     */
    abstract fun customRetrofitClientBuilder(build: Retrofit.Builder)

}
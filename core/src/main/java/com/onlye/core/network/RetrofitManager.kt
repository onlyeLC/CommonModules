package com.onlye.core.network

import com.onlye.network.BaseRetrofitManager
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * @author: onlye
 * @description:
 * @date :2023/5/26 0:17
 * @version:
 * @email: 986289773@qq.com
 */

/**
 * 顶层函数方便快速调用
 */
val apiService: ApiService by lazy {
    RetrofitManager.create()
}

object RetrofitManager : BaseRetrofitManager() {


    override fun customOkHttpClientBuilder(builder: OkHttpClient.Builder) {

    }

    override fun customRetrofitClientBuilder(build: Retrofit.Builder) {

    }


}


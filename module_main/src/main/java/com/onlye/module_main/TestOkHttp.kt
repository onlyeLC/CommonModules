package com.onlye.module_main

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.internal.connection.RealCall
import java.io.IOException
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

private const val TIME_OUT_LENGTH: Long = 10L

class TestOkHttp {

    lateinit var okHttpClient: OkHttpClient

    fun init() {
         okHttpClient = OkHttpClient.Builder()
            .callTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT_LENGTH, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
    }

    fun request() {
        val request = Request.Builder().get().url("https://www.wanandroid.com/").build()

        val call = okHttpClient.newCall(request)

        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {

            }
        })

        val response = call.execute()
    }

    fun run1() {
        Runnable{

        }

        thread {

        }

        synchronized(this) {

        }
    }

}
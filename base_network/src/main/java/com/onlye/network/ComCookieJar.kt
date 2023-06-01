package com.onlye.network

import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl

/**
 * @author: onlye
 * @description:
 * @date:2023/6/1 18:09
 * @version:
 * @email: 986289773@qq.com
 */
class ComCookieJar: CookieJar {
    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        val listOf = listOf<Cookie>()
        return listOf
    }

    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {

    }
}
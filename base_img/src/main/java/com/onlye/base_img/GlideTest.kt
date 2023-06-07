package com.onlye.base_img

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * @author: onlye
 * @description:
 * @date :2023/6/6 22:51
 * @version:
 * @email: 986289773@qq.com
 */
class GlideTest {
    fun testGlide(context: Context?, iv: ImageView) {
        context?.let {
            val load = Glide.with(it).startStopRequestBy {
                true
            }.load("").into(iv)

        }

    }
}
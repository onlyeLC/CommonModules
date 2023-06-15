package com.onlye.core.utils

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory

/**
 * @author: onlye
 * @description:
 * @date :2023/6/11 23:40
 * @version:
 * @email: 986289773@qq.com
 */

/**
 * Bitmap下采样
 */
fun compress(res: Resources,resId:Int,reqWidth:Int,reqHeight:Int):Bitmap{
    return BitmapFactory.Options().run {
        inJustDecodeBounds = true
        BitmapFactory.decodeResource(res,resId,this)
        inSampleSize = calculateInSampleSize(this,reqWidth,reqHeight)
        inJustDecodeBounds = false
        BitmapFactory.decodeResource(res,resId,this)
    }
}

/**
 * 根据给定的图片宽高，将图片缩放比例计算到临界值
 * 保持最后采样的宽和高都大于请求的宽和高的前提下（避免图像失真）
 */
fun calculateInSampleSize(options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
    // TODO: 根据给定宽高计算下采样比例
    options.outWidth
    options.outHeight
    return 1
}

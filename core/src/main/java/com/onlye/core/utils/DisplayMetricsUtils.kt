package com.onlye.core.utils

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import android.view.Choreographer
import com.bumptech.glide.load.engine.Resource

/**
 * @author: onlye
 * @description:
 * @date :2023/6/11 21:05
 * @version:
 * @email: 986289773@qq.com
 */
object DisplayMetricsUtils {

    fun px2dp(context: Context,){
        18f.px
    }

    /**
     * 扩展属性，将dp值转化为px
     */
     val Float.px
    get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,this,Resources.getSystem().displayMetrics)

    /**
     *扩展属性，将px值转化为dp
     */
//     val Float.dp
//     get() =
}



package com.onlye.base_img

import com.bumptech.glide.RequestManager

/**
 * @author: onlye
 * @description:
 * @date:2023/6/7 12:35
 * @version: Glide扩展函数
 * @email: 986289773@qq.com
 */
class GlideExt {
    
}

/**
 * 根据给定的条件自动启停加载请求
 */
fun RequestManager.startStopRequestBy(isPause:()->Boolean):RequestManager {
    return also {
        if (isPause())pauseRequests() else resumeRequests()
    }
}
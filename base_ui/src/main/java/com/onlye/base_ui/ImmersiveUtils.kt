package com.onlye.base_ui

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.view.Window
import com.gyf.immersionbar.ImmersionBar

/**
 * @author: onlye
 * @description:
 * @date :2023/6/15 23:04
 * @version:
 * @email: 986289773@qq.com
 */
class ImmersiveUtils {

}

/**
 *  View.SYSTEM_UI_FLAG_FULLSCREEN:隐藏状态栏，点击屏幕显示
    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN：将布局扩展到状态栏
    View.SYSTEM_UI_FLAG_LAYOUT_STABLE：当在全屏和非全屏切换时保持界面稳定
    View.SYSTEM_UI_FLAG_IMMERSIVE：沉浸模式
    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION：将布局扩展到导航栏
    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION：隐藏导航栏，点击屏幕显示
    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION：沉浸模式，用户可以交互的界面。同时，用户上下拉系统栏时，会自动隐藏系统栏
 */
fun Activity.immersive(){
    ImmersionBar.with(this).init()
}
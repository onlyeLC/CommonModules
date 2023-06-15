package com.onlye.module_main

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsAnimationCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.onlye.base_ui.immersive
import com.onlye.core.network.RetrofitManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initGPS ({
//            requestLocationPermissionDefault {
//                Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
//
//            }
//        },{
//            Toast.makeText(this, "开启定位失败", Toast.LENGTH_SHORT).show()
//        })

//        requestLocation()

//        val create = RetrofitManager.create<ApiService>()

//        TestOkHttp().apply {
//            init()
//            request()
//        }
//        window.statusBarColor = Color.TRANSPARENT
//        window.decorView.systemUiVisibility =
//            (
////                    View.SYSTEM_UI_FLAG_FULLSCREEN
//                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                    or View.SYSTEM_UI_FLAG_IMMERSIVE
//                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                    )
        //控制系统栏沉浸式
        WindowCompat.setDecorFitsSystemWindows(window,false)
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        //获取的是WindowInsetsControllerCompat对象，
        // 通过这个来控制系统栏（键盘、导航栏、状态栏）显示、隐藏等
        // 控制系统栏字体、图标颜色
        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
        insetsController.apply {
            hide(WindowInsetsCompat.Type.navigationBars())
            isAppearanceLightStatusBars = false
        }
        //软键盘升降动画监听
        ViewCompat.setWindowInsetsAnimationCallback(window.decorView, object :
            WindowInsetsAnimationCompat.Callback(DISPATCH_MODE_STOP) {
            override fun onProgress(
                insets: WindowInsetsCompat,
                runningAnimations: MutableList<WindowInsetsAnimationCompat>,
            ): WindowInsetsCompat {
               println("top:${ insets.getInsets(WindowInsetsCompat.Type.ime()).bottom}")
                return insets
            }

        })
        window.decorView.setOnApplyWindowInsetsListener{view,insets->
            insets
        }
//        immersive()
    }

}
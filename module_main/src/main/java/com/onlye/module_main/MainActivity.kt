package com.onlye.module_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        val create = RetrofitManager.create<ApiService>()

        TestOkHttp().apply {
            init()
            request()
        }
    }

}
package com.onlye.utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.onlye.network.RetrofitManager

//import com.onlye.permission.requestLocationPermissionDefault
//import com.onlye.permission.initGPS

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

        val create = RetrofitManager.create<ApiService>()
    }
}
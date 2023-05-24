package com.onlye.utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onlye.permission.requestLocation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a:String = ""
        a.let {

        }

        View(this).animate().withLayer()

        requestLocation()
    }
}
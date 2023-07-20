package com.example.constraintapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getdata()
        addition()
    }
    fun getdata(){
        Log.d("TAG", "getdata: Github demo")
    }
    fun addition(){
        Toast.makeText(this@MainActivity,"test branch",Toast.LENGTH_LONG).show()
    }
}
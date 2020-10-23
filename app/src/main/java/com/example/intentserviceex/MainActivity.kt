package com.example.intentserviceex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, ExIntentService::class.java)
        intent.putExtra("task","1")
        startService(intent)

        val intent2 = Intent(this, ExIntentService::class.java)
        intent2.putExtra("task","2")
        startService(intent2)

    }
}
package com.example.intentserviceex

import android.app.IntentService
import android.content.Intent
import android.util.Log


class ExIntentService: IntentService("is1") {
    override fun onHandleIntent(p0: Intent?) {
        when(p0?.getStringExtra("task")) {
            "1" -> for (i in 1..10) {
                Log.d("mytag","task 1: $i")
                Thread.sleep(500)
            }
            "2" -> for (i in 1..10) {
                Log.d("mytag","task 2: $i")
                Thread.sleep(500)
            }
        }
    }
}
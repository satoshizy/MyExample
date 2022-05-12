package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_WhiteScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        thread {
            Thread.sleep(1000)
            runOnUiThread { startActivity(Intent(this, MainActivity::class.java)) }
            finish()
        }
    }
}
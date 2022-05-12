package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        val mIv4=findViewById<ImageView>(R.id.iv_4)
        Glide.with(this).load("https://illlustrations.co/static/cb0069bee07d4675ef939a4c61774cac/ee604/116-gameboy.png").into(mIv4)
    }
}
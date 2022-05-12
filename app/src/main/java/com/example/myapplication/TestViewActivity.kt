package com.example.myapplication

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TestViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_view)

        val tv4 = findViewById<TextView>(R.id.tv_4)
        tv4.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG//中斜线
        tv4.paint.isAntiAlias = true//抗锯齿
        val tv5 = findViewById<TextView>(R.id.tv_5)
        tv5.isSelected = true//确认选中实现跑马灯
        val tv6 = findViewById<TextView>(R.id.tv_6)
        tv6.setOnClickListener {
            finish()
        }
    }
}
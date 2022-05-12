package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val mBtn3 = findViewById<Button>(R.id.btn_3)
        mBtn3.setOnClickListener {
            Toast.makeText(this, "点击了按钮3", Toast.LENGTH_SHORT).show()
        }
    }

    fun showToast(view: View) {
        Toast.makeText(this, "点击了按钮4", Toast.LENGTH_SHORT).show()
    }
}
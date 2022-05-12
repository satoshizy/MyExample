package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        val mCb5 = findViewById<CheckBox>(R.id.cb_5)
        val mCb6 = findViewById<CheckBox>(R.id.cb_6)
        val mCb7 = findViewById<CheckBox>(R.id.cb_7)
        val mCb8 = findViewById<CheckBox>(R.id.cb_8)
        mCb5.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this,if(isChecked)"5选中了" else "5未选中",Toast.LENGTH_SHORT).show()
        }
        mCb6.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this,if(isChecked)"6选中了" else "6未选中",Toast.LENGTH_SHORT).show()
        }
        mCb7.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this,if(isChecked)"7选中了" else "7未选中",Toast.LENGTH_SHORT).show()
        }
        mCb8.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this,if(isChecked)"8选中了" else "8未选中",Toast.LENGTH_SHORT).show()
        }
    }
}
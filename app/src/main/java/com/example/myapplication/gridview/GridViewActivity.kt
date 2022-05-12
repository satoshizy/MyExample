package com.example.myapplication.gridview

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class GridViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridview)
        val mGv1 = findViewById<GridView>(R.id.gv)
        mGv1.adapter = MyGridAdapter(this)
        mGv1.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, "点击了pos：$i", Toast.LENGTH_SHORT).show()
        }
        mGv1.setOnItemLongClickListener { _, _, i, _ ->
            Toast.makeText(this, "长按了pos：$i", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
package com.example.myapplication.listview

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.myapplication.R

class ListViewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        val mLv1 = findViewById<ListView>(R.id.lv_1)
        mLv1.adapter = MyListAdapter(this)
        mLv1.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, "点击pos: $i", Toast.LENGTH_SHORT).show()
        }
        mLv1.setOnItemLongClickListener { _, _, i, _ ->
            Toast.makeText(this, "长按pos: $i", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
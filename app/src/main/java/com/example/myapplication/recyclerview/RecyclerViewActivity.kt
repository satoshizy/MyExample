package com.example.myapplication.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val mBtnLinear = findViewById<Button>(R.id.btn_linear)
        val mBtnHor = findViewById<Button>(R.id.btn_hor)
        val mBtnGrid = findViewById<Button>(R.id.btn_grid)
        mBtnLinear.setOnClickListener {
            val intent = Intent(this, LinearRecyclerViewActivity::class.java)
            startActivity(intent)
        }
        mBtnHor.setOnClickListener {
            val intent = Intent(this, HorRecyclerViewActivity::class.java)
            startActivity(intent)
        }
        mBtnGrid.setOnClickListener {
            val intent = Intent(this, GridRecyclerActivity::class.java)
            startActivity(intent)
        }
    }
}
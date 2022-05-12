package com.example.myapplication.recyclerview

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class HorRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hor_recycler_view)
        val mRvHor = findViewById<RecyclerView>(R.id.rv_hor)
        mRvHor.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)

        mRvHor.adapter = HorAdapter(this, object : HorAdapter.OnItemClickListener {
            override fun onClick(position: Int) {
                Toast.makeText(
                    this@HorRecyclerViewActivity,
                    "click$position",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        mRvHor.addItemDecoration(MyDecoration())
    }
    internal inner class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.set(0, 0, resources.getDimensionPixelOffset(R.dimen.dividerHeight), 0)
        }
    }
}
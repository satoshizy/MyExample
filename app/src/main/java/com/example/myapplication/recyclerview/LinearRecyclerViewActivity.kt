package com.example.myapplication.recyclerview


import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class LinearRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_recycler_view)
        val mRvMain = findViewById<RecyclerView>(R.id.rv_main)
        mRvMain.layoutManager = LinearLayoutManager(this)
        mRvMain.adapter = HorAdapter(this, object : HorAdapter.OnItemClickListener {
            override fun onClick(position: Int) {
                Toast.makeText(
                    this@LinearRecyclerViewActivity,
                    "click$position",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        mRvMain.addItemDecoration(MyDecoration())
    }

    internal inner class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.set(0, 0, 0, resources.getDimensionPixelOffset(R.dimen.dividerHeight))
        }
    }
}
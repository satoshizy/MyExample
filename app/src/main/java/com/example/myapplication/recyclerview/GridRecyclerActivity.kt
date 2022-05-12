package com.example.myapplication.recyclerview


import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class GridRecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_recycler)
        val mRvGrid = findViewById<RecyclerView>(R.id.rv_grid)
        mRvGrid.layoutManager = GridLayoutManager(this, 3)
        mRvGrid.adapter = GridAdapter(this, object : GridAdapter.OnItemClickListener {
            override fun onClick(position: Int) {
                Toast.makeText(
                    this@GridRecyclerActivity,
                    "click$position",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        mRvGrid.addItemDecoration(MyDecoration())
    }

    internal inner class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.set(
                0,
                0,
                resources.getDimensionPixelOffset(R.dimen.dividerHeight),
                resources.getDimensionPixelOffset(R.dimen.dividerHeight)
            )
        }
    }
}
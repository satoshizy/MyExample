package com.example.myapplication.recyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class GridAdapter(
    private val mContext: Context,
    private val mlistener: OnItemClickListener
) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(
            LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recyclerview_item, parent, false)
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.textView.text = "Hello"
        holder.itemView.setOnClickListener {
            mlistener.onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return 80
    }

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tv_title)
    }

    interface OnItemClickListener {
        fun onClick(position: Int)
    }
}
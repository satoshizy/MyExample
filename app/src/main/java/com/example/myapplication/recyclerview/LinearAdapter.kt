package com.example.myapplication.recyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class LinearAdapter(
    private val mContext: Context,
    private val mlistener: HorAdapter.OnItemClickListener
) :
    RecyclerView.Adapter<LinearAdapter.LinearViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        return LinearViewHolder(
            LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item, parent, false)
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        holder.textView.text = "Hello World"
        holder.itemView.setOnClickListener {
            mlistener.onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return 30
    }

    class LinearViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tv_title)
    }

    interface OnItemClickListener {
        fun onClick(position: Int)
    }
}
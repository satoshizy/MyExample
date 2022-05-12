package com.example.myapplication.gridview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myapplication.R

class MyGridAdapter(private val mContext: Context) : BaseAdapter() {

    private val mLayoutInflater: LayoutInflater = LayoutInflater.from(mContext)

    override fun getCount(): Int {
        return 20
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    internal class ViewHolder {
        var imageView: ImageView? = null
        var textView: TextView? = null
    }

    @SuppressLint("InflateParams")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        val holder: ViewHolder?
        var view = p1
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.layout_grid_item, null)
            holder = ViewHolder()
            holder.imageView = view.findViewById(R.id.iv_grid)
            holder.textView = view.findViewById(R.id.tv_title)
            view?.tag = holder
        } else {
            holder = view.tag as ViewHolder?
        }
        //赋值
        holder?.textView?.text = "天哥"
        holder?.imageView?.let {
            Glide.with(mContext)
                .load("https://i1.hdslb.com/bfs/face/6e4e46dc48b17230245d7b78ab5331f68031e0fd.jpg@96w_96h.webp")
                .into(it)
        }
        return view
    }

}
package com.example.myapplication.listview

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

class MyListAdapter(private val mContext: Context) : BaseAdapter() {
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
        var tvTitle: TextView? = null
        var tvTime: TextView? = null
        var tvContext: TextView? = null
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        val holder: ViewHolder?
        var view = p1
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.layout_list_item, null)
            holder = ViewHolder()
            holder.imageView = view?.findViewById(R.id.iv_item_icon)
            holder.tvTitle = view?.findViewById(R.id.tv_item_name)
            holder.tvTime = view?.findViewById(R.id.tv_item_create_time)
            view?.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }
        //给控件赋值
        holder.tvTitle?.text = "这是标题"
        holder.tvTime?.text = "2088-08-08"
        holder.tvContext?.text = "这是内容"
        holder.imageView?.let {
            mContext.let { it1 ->
                Glide.with(it1)
                    .load("https://i1.hdslb.com/bfs/face/6e4e46dc48b17230245d7b78ab5331f68031e0fd.jpg@96w_96h.webp")
                    .into(it)
            }
        }
        return view
    }

}
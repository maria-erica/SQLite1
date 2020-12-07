package com.example.sqlite.adapter

import android.content.Context

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sqlite.R
import com.example.sqlite.albumArr

class gridAdapter(var mcontext: Context, var imgList: MutableList<albumArr>): BaseAdapter(){


    override fun getCount(): Int {
        return imgList.size
    }

    override fun getItem(position: Int): Any {
        return imgList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = View.inflate(mcontext, R.layout.album_row,null)
        val image = view.findViewById<ImageView>(R.id.imgAlbum)
        val relDate = view.findViewById<TextView>(R.id.relDate)
        val title = view.findViewById<TextView>(R.id.titleAlbum)
        var imageIcon =imgList.get(position)
        var relDateText = imageIcon.date
        var titleText = imageIcon.title
        relDate.text = "Release Date: $relDateText"
        title.text = "Album Title: $titleText"
        return view
    }
}
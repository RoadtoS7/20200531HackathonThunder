package com.tistory.comfy91.a20200531hackathonthunder

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_profile = itemView.findViewById<ImageView>(R.id.img_profile)
    val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
    val tv_contents = itemView.findViewById<TextView>(R.id.tv_contents)

    fun bind(listData: ListData) {
        tv_title.text = listData.tv_title
        tv_contents.text = listData.tv_contents

    }
}
package com.tistory.comfy91.a20200531hackathonthunder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CalendarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
     private val imgv_day: ImageView = itemView.findViewById(R.id.imgv_day)

     fun bind(data: CalendarData){
         Glide.with(itemView.context).load(data.imgIcon).into(imgv_day)

     }

}
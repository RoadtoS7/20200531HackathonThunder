package com.tistory.comfy91.a20200531hackathonthunder

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CalendarView
import androidx.recyclerview.widget.RecyclerView


class AprilCalendarAdapter(private val context: Context): RecyclerView.Adapter<CalendarViewHolder>(){
    var datas = mutableListOf<CalendarData>()


    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_insta, parent, false)
        return CalendarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}
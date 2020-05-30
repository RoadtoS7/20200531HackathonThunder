package com.tistory.comfy91.a20200531hackathonthunder

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter (private val context: Context) : RecyclerView.Adapter<ListViewHolder>(){

    var datas = mutableListOf<ListData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view =  LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       // holder.bind(datas[position])
    }


}
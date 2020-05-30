package com.tistory.comfy91.a20200531hackathonthunder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListViewActivity : AppCompatActivity() {

    lateinit var listAdapter: ListAdapter
    val datas = mutableListOf<ListData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


    }

}

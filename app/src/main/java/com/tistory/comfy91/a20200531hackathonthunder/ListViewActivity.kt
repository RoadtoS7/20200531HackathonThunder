package com.tistory.comfy91.a20200531hackathonthunder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    lateinit var listAdapter: ListAdapter
    val datas = mutableListOf<ListItemData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


    }

    private fun initUi() {
        val rvAdapter = ListAdapter(this)

        rv_diary_list.adapter = rvAdapter
        loadDatas()
    }

    private fun loadDatas(){
        datas.apply {
            add(
                ListItemData(
                    tv_title = "학교앞 떡볶이집",
                    img_profile = R.drawable.an_diary_ic_bunsik,
                    tv_contents = "벤또는 언제나 맛있다.\n" +
                            "너무 맛있어서 눈물이 난다. 속이 쓰리다.\n" +
                            "좀 짜다."

                )
            )
            add(
                ListItemData(
                    tv_title = "순대국밥 먹은날",
                    img_profile = R.drawable.ic_korean,
                    tv_contents = "우리집 아파트 아래 순대국밥은\n" +
                            "진짜 존맛탱이다.\n" +
                            "밤새고 먹는 순대국밥 사랑해요."

                ))
            add(
                ListItemData(
                    tv_title = "리조또 먹은날",
                    img_profile = R.drawable.an_diary_ic_italian,
                    tv_contents = "우리집 옆에 있는 리조또 집은 진짜 다 맛있는데\n" +
                            "비싸서 많이 먹지 못해…"

                ))
            add(
                ListItemData(
                    tv_title = "연화중식 진짜 개맛있어",
                    img_profile = R.drawable.an_diary_ic_chinese,
                    tv_contents = "와 이건 천상의 맛…\n" +
                            "탕수육 미쳤음?"

                ))
        }
        listAdapter.datas = datas
        listAdapter.notifyDataSetChanged()
    }
}

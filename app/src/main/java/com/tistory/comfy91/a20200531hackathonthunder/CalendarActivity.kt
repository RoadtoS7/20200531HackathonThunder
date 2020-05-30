package com.tistory.comfy91.a20200531hackathonthunder

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_calendar.*
import kotlin.properties.Delegates

class CalendarActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        initUi()
    }

    private fun initUi(){
        val rvAdapterApril = CalendarAdapter(this@CalendarActivity)
            .apply {
                this.datas = getDummyData()
            }
        rv_april_cal.adapter = rvAdapterApril
        rv_april_cal.layoutManager = GridLayoutManager(this@CalendarActivity, 7)
        rv_april_cal.addItemDecoration(CalendarItemDeco(3, 10, true))

        rvAdapterApril.notifyDataSetChanged()
    }
    private fun getDummyData(): MutableList<CalendarData>{
        return mutableListOf(
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png"),
            CalendarData("https://cdn.pixabay.com/photo/2020/05/26/18/22/background-5224200__480.png")
        )
    }

    private class CalendarItemDeco(
        private val mSpanCount: Int,
        private val mSpacing: Int,
        private val mIncludeEdge: Boolean
    ): RecyclerView.ItemDecoration() {


        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            val position = parent.getChildAdapterPosition(view)
            val column = position % mSpanCount
            if(mIncludeEdge){
                outRect.left = mSpacing - column * mSpacing / mSpanCount;
                outRect.right =(column + 1) * mSpacing / mSpanCount;
                if(position < mSpanCount){
                    outRect.top = mSpacing;
                }
                outRect.bottom = mSpacing;
            }else{
                outRect.left = column * mSpacing / mSpanCount;
                outRect.right = mSpacing - (column + 1) * mSpacing / mSpanCount;
                if(position < mSpanCount){
                    outRect.top = mSpacing;
                }
            }
        }

    }
}

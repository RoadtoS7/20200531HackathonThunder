package com.tistory.comfy91.a20200531hackathonthunder



import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.util.TypedValue
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import kotlinx.android.synthetic.main.activity_calendar.*


class CalendarActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        initAppBar()
        initUi()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_action, menu)
        return true
    }

    private fun initAppBar(){
        val ab: androidx.appcompat.app.ActionBar? = supportActionBar
        ab?.setIcon(R.drawable.main_img_logo)
        ab?.setDisplayUseLogoEnabled(true)
        ab?.setDisplayShowHomeEnabled(true)
    }
    private fun initUi() {
        val rvAdapterApril = CalendarAdapter(this@CalendarActivity)
            .apply {
                this.datas = getDummyData()
            }
        rv_april_cal.adapter = rvAdapterApril
        rv_april_cal.layoutManager = GridLayoutManager(this@CalendarActivity, 7)
//        rv_april_cal.addItemDecoration(CalItemDecoration(this@CalendarActivity, 2))

        val rvAdapterMarch = CalendarAdapter(this@CalendarActivity)
            .apply {
                this.datas = getDummyData()
            }
        rv_march_cal.adapter = rvAdapterMarch
        rv_march_cal.layoutManager = GridLayoutManager(this@CalendarActivity, 7)

        val rvAdapterJun = CalendarAdapter(this@CalendarActivity)
            .apply {
                this.datas = getDummyData()
            }
        rv_jun_cal.adapter = rvAdapterMarch
        rv_jun_cal.layoutManager = GridLayoutManager(this@CalendarActivity, 7)

        rvAdapterApril.notifyDataSetChanged()
        rvAdapterMarch.notifyDataSetChanged()
        rvAdapterJun.notifyDataSetChanged()
    }

    private fun getDummyData(): MutableList<CalendarData> {
        return mutableListOf(
            CalendarData(
                "2020-05-01",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-02",
                false,
                R.drawable.ic_chinese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-03",
                false,
                R.drawable.ic_chineseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-04",
                false,
                R.drawable.ic_italian,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-05",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-06",
                false,
                R.drawable.ic_japaneseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-07",
                false,
                R.drawable.ic_italian,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-08",
                false,
                R.drawable.ic_chineseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-09",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-10",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-11",
                false,
                R.drawable.ic_japaneseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-12",
                false,
                R.drawable.ic_chinese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-13",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-14",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-15",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-16",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-17",
                false,
                R.drawable.ic_chineseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-18",
                false,
                R.drawable.ic_italian,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-19",
                false,
                R.drawable.ic_koreanblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-20",
                false,
                R.drawable.ic_japaneseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-21",
                false,
                R.drawable.ic_italian,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-22",
                false,
                R.drawable.ic_chineseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-23",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-24",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-25",
                false,
                R.drawable.ic_japaneseblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-26",
                false,
                R.drawable.ic_chinese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-27",
                false,
                R.drawable.ic_japanese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-28",
                false,
                R.drawable.ic_korean,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-29",
                false,
                R.drawable.ic_koreanblack,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-30",
                false,
                R.drawable.ic_chinese,
                "korean",
                "I"
            ),
            CalendarData(
                "2020-05-31",
                false,
                R.drawable.ic_italian,
                "korean",
                "I"
            )
        )
    }


    class CalItemDecoration(private val context: Context, private val space: Int) : ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect, view: View,
            parent: RecyclerView, state: RecyclerView.State
        ) {
            outRect.left = dpToPx(space)
            outRect.right = dpToPx(space)
            outRect.bottom = dpToPx(space)
            outRect.top = dpToPx(0)
//            // Add top margin only for the first item to avoid double space between items
//            if (parent.getChildLayoutPosition(view) == 0) {
//                outRect.top = dpToPx(space)
//            } else {
//                outRect.top = dpToPx(0)
//            }
        }

        private fun dpToPx( dp: Int): Int {
            return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp.toFloat(),
                context.resources.displayMetrics
            ).toInt()
        }

    }
//     class CalItemDecoration constructor(
//        private val context: Context,
//        private val mSpanCount: Int,
//        private val mSpacing: Int,
//        private val mIncludeEdge: Boolean
//    ) :
//        ItemDecoration() {
//        override fun getItemOffsets(
//            outRect: Rect,
//            view: View,
//            parent: RecyclerView,
//            state: RecyclerView.State
//        ) {
//            val position = parent.getChildAdapterPosition(view)
//            val column = position % mSpanCount
//            if (mIncludeEdge) {
//                val left = mSpacing - column * mSpacing / mSpanCount
//                outRect.left = dpToPx(context, left)
//                val right = (column + 1) * mSpacing / mSpanCount
//                outRect.right = dpToPx(context, right)
//                if (position < mSpanCount) {
//                    outRect.top = dpToPx(context, mSpacing)
//                }
//                outRect.bottom = dpToPx(context, mSpacing)
//            } else {
//                val left = column * mSpacing / mSpanCount
//                outRect.left = dpToPx(context, left)
//                val right = mSpacing - (column + 1) * mSpacing / mSpanCount
//                outRect.right = dpToPx(context, right)
//                if (position < mSpanCount) {
//                    outRect.top = dpToPx(context, mSpacing)
//                }
//            }
//        }
//
//
//        private fun dpToPx(context: Context, dp: Int): Int {
//            return TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,
//                dp.toFloat(),
//                context.resources.displayMetrics
//            ).toInt()
//        }
//
//    }
}

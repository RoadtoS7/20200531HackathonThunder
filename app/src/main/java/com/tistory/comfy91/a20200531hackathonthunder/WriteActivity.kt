package com.tistory.comfy91.a20200531hackathonthunder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.write_activity.*

class WriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.write_activity)

        image1.setOnClickListener {
            showToast("중식이 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            image1.setImageResource(R.drawable.click)
            image2.setImageResource(R.drawable.nonclick)
            image3.setImageResource(R.drawable.nonclick)
            image4.setImageResource(R.drawable.nonclick)
            image5.setImageResource(R.drawable.nonclick)
        }

        image2.setOnClickListener {
            showToast("양식이 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            image1.setImageResource(R.drawable.nonclick)
            image2.setImageResource(R.drawable.click)
            image3.setImageResource(R.drawable.nonclick)
            image4.setImageResource(R.drawable.nonclick)
            image5.setImageResource(R.drawable.nonclick)
        }

        image3.setOnClickListener {
            showToast("일식이 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            image1.setImageResource(R.drawable.nonclick)
            image2.setImageResource(R.drawable.nonclick)
            image3.setImageResource(R.drawable.click)
            image4.setImageResource(R.drawable.nonclick)
            image5.setImageResource(R.drawable.nonclick)
        }

        image4.setOnClickListener {
            showToast("한식이 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            image1.setImageResource(R.drawable.nonclick)
            image2.setImageResource(R.drawable.nonclick)
            image3.setImageResource(R.drawable.nonclick)
            image4.setImageResource(R.drawable.click)
            image5.setImageResource(R.drawable.nonclick)
        }

        image5.setOnClickListener {
            showToast("기타가 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            image1.setImageResource(R.drawable.nonclick)
            image2.setImageResource(R.drawable.nonclick)
            image3.setImageResource(R.drawable.nonclick)
            image4.setImageResource(R.drawable.nonclick)
            image5.setImageResource(R.drawable.click)
        }
    }
}
package com.tistory.comfy91.a20200531hackathonthunder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tistory.comfy91.a20200531hackathonthunder.api.RequestToServer
import com.tistory.comfy91.a20200531hackathonthunder.data.RequestWrite
import com.tistory.comfy91.a20200531hackathonthunder.data.ResponseWrite
import kotlinx.android.synthetic.main.write_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WriteActivity : AppCompatActivity() {

//    private val requestToServer = RequestToServer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.write_activity)

        button2.setOnClickListener {
            showToast("추가 버튼이 눌렸습니다.")

            if (edit1.text.isNullOrBlank() || edit2.text.isNullOrBlank()) {
                showToast("제목과 내용을 채워주세요.")
            } else {
//                requestToServer.service.requestWrite(
//                    RequestWrite(
//                        uid = null,
//                        diary_title = edit1.text.toString(),
//                        icon_category = null,
//                        diary_content = edit2.text.toString()
//                    )
//                ).enqueue(object : Callback<ResponseWrite> {
//                    override fun onFailure(call: Call<ResponseWrite>, t: Throwable) {
//                        //통신 실패
//                    }
//
//                    override fun onResponse(
//                        call: Call<ResponseWrite>,
//                        response: Response<ResponseWrite>
//                    ) {
//                        //통신 성공
//                        if (response.isSuccessful) {
//                            if (response.body()!!.success) {
//                                //ResponseWrite의 success가 true인 경우
//                            }
//                        }
//                    }
//
//                })

            }
        }

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


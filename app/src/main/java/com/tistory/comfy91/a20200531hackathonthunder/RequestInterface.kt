package com.tistory.comfy91.a20200531hackathonthunder

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RequestInterface {
    @GET("/diary/list/:uid")
    fun requestDiary(@Body body: RequestDiaryList) : Call<ResponseDiaryListData>

    @GET("/diary/:uid")
    fun requestCalendar(@Body body: RequestCalendar) : Call<CalendarData>

//    @POST("/diary/register")
//    fun requestDiaryRegister(@Body )
}
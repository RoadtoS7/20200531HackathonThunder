package com.tistory.comfy91.a20200531hackathonthunder

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service : RequestInterface= retrofit.create(RequestInterface::class.java)
}
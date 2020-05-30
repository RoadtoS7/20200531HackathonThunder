package com.tistory.comfy91.a20200531hackathonthunder.data

import com.google.gson.annotations.SerializedName

data class ResponseDiaryListData (
    @SerializedName("diary")
    val diary_title : String,
    val diary_content : Boolean,
    val icon_img : String
)
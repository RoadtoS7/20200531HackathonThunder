package com.tistory.comfy91.a20200531hackathonthunder.data

data class RequestWrite(
    val uid: String?,
    val diary_title: String,
    val icon_category: String?,
    val diary_content: String
)
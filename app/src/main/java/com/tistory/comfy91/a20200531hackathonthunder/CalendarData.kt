package com.tistory.comfy91.a20200531hackathonthunder

data class CalendarData(
    val date: String, // 날짜: "2020-05-31"
    val ifWritten: Boolean, // 작성했는지 유무 :Boolean
    val imgIcon: String, // 아이콘 이미지:
    val icon: String, // 아이콘 카테고리
    val title: String // 제목
)
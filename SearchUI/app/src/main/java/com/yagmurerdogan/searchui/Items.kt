package com.yagmurerdogan.searchui

data class Items(
    val id: Int,
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val itemList = arrayListOf<Items>(
    Items(1,"USB Flash",false,R.drawable.usbflashdrive),
    Items(2,"Woman",true,R.drawable.employerf),
    Items(3,"Calculator",true,R.drawable.calculator),
    Items(4,"Projector",true,R.drawable.projector),
    Items(5,"Card Board",false,R.drawable.cardboard),
    Items(6,"Desk Lamp",true,R.drawable.desklamp),
    Items(7,"Man",false,R.drawable.employerm),
    Items(8,"Sticky Notes",true,R.drawable.stickynotes)
)
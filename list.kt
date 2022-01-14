package com.example.kotlin

fun main(){
    val anyType = listOf(1,2,3,4,true,false,"string")
   // print(anyType.size)   //to print size of list
   // print(anyType[5])

    //for iteration
    for(i in anyType)
        println(i)
//in order to add elements in list we firstly convert them into mutable then we can add
    //by default list are immutable


    //now we can add
  var mutable = anyType.toMutableList()
    val months = arrayOf("sun","mon","tues","wed")

    mutable.addAll(months)

    print(mutable)


    //we can also create a list of mutable type
    val days = mutableListOf(1,3,"sun","mon","tues","wed")
    val all = arrayOf("thurs","frid","sat")
    days.addAll(all)
    days.removeAt(3)
    print(days)
}

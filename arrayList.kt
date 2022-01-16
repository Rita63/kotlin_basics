             package com.example.kotlin
//Please write a program that adds five Numbers (Double) to an arrayList and then calculates
// the average of those numbers. Please use a for (in) loop in this exercise.

//arraylist is an dynamic array we can add or remove elements in this array acc. to our choice.

fun main(){
    val arrayList = ArrayList<Double>()
    arrayList.add(5.67)
    arrayList.add(5.6)
    arrayList.add(5.87)
    arrayList.add(5.07)
    arrayList.add(5.57)
    var total = 0.0
    for(i in arrayList){
        total +=i

    }
    println(total)
    var average =  total/arrayList.size
    print("average is: $average")

}

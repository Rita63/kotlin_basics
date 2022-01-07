package com.example.kotlin

fun main() {
   
var season = 3
    when(season){
        1->println("spring")
        2->println("summer")
        3->{println("autmn")
        println("fall")}
        4->println("winter")
        else->println("invalid season")}

    }

  //another eg
    var month = 10
    when (month) {
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9 downTo 2 -> println("winter")
        else -> println("invalid season")
    }
}


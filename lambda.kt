package com.example.kotlin

//lambda expression - a func with no name

//#example ->addition of two number using lambda expression
  /*fun main(){
      val sum = {a:Int,b:Int-> print(a+b)}
    sum(19,7)
  }  */

//another way
fun main(){
    val sum : (Int,Int)->Int={a:Int,b:Int->a+b}
    println(sum(23,42))
}


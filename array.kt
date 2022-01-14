package com.example.kotlin

fun main() {
    // val numbers = intArrayOf(2,4,6,7,8)  //we can declare array of type int like this

    val numbers = arrayOf(3, 7, 8, 9)  //another way of declare array of type int
    //  print(numbers)   //in this we can get the array address

    //to print array values there is a specific method"contentToString"
    println(numbers.contentToString())

    // for iteration inside array we use the for loop

    for (element in numbers) //element is variable here
        println("${element + 2}")

    //for accessing array values
    print(numbers[3])

    //to change the value inside array,by accessing index
    numbers[1] = 2
    numbers[2] = 3
    print("new array is ${numbers.contentToString()}") //to print in brackets

    //array of string type
    val days = arrayOf("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY")

    println(days.contentToString())

    // to print mix data types
    val mix = arrayOf("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",1,3,Fruit("pineapple",78.0))

    println(mix.contentToString())

    //we can also store objects in an array
//created objects
    val fruits = arrayOf(Fruit("banana", 46.5), Fruit("guava", 67.9))

    for(i in fruits)
        println("${i.name}")  //to access only fruit name
  //  println(fruits.contentToString())
}

    data class Fruit(val name: String,val price: Double)

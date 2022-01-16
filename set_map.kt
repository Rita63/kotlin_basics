package com.example.kotlin

fun main() {
    var fruits = setOf("mango", "banana", "apple", "mango")  //initializing a set

    println(fruits)
    println(fruits.size)  //to print the size
    println(fruits.toSortedSet())   //to sort the elements

    //in sets,duplicated items not count,only single items will count.
// but the problem with this set is that it is not mutable,to convert it into mutable,we use the function toMutableList()


    var newSet = fruits.toMutableList()
    //NOW, it is mutable we can add elements to it.
    newSet.add("water melon")
    newSet.add("pear")
    println(newSet)
    println(newSet.elementAt(3))  //to access a particular index


    //Maps - it is type of collection that holds dats in the form of key value pair,key is unique,it holds only one value for each pair.

    val days = mapOf( 1 to "monday", 2 to "tuesday",  3 to "wednesday", 4 to "thursday")
    println(days)
    println(days[2])  //to access the value using key
    // TO CONVERT MAPS INTO MUTABLE WE USE toMutableMap func.

    val newMap = days.toMutableMap()
    newMap[5] = "friday"  //to add the value in the key
    newMap[7] = "sunday"
    newMap[6] = "saturday"
println(newMap.toSortedMap())   // to sort the map

// to iterate using loop
    for (key in days.keys) {
        println("$key is to ${days[key]}")
    }

    //HERE WE ADD OBJECTS AS VALUES
val Fruits = mapOf("favourite"  to fruit("guava",45.0), "ok" to fruit("apple",25.0))
println(Fruits)

}
data class fruit(val name:String, val price: Double)

package com.example.kotlin

import kotlin.math.floor


fun main() {
    val stringList: List<String> = listOf("denis", "john", "mac", "garry", "miachael")  //syntax for creating list of type string
    val mixedTypeList: List<Any> = listOf("denis", "p", 80.9, 78)  //any type of object in our list

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("double : '$value' with floor value ${floor(value)}")

        } else if (value is String) {
            println("String: '$value' of length ${value.length}")
        } else {
            print("unknown")
        }
    }


        //alternate way of writing
        /*for (value in mixedTypeList)
        when(value){
            is Int-> print("integer :$value")
        }
    }*/
        //smart cast
    val obj1:Any= "im a string"
    if(obj1 !is String) {
        println("not a string")}
        else{
            //obj is automatically cast to a string in this scope
            print("found a string of length ${obj1.length}")
        }
    }
  

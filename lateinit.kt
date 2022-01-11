package com.example.kotlin

import java.lang.IllegalArgumentException
import java.util.*

fun main(){
   var myCar = Car()   //object of class car
   println("brand is:${myCar.myBrand}")
    myCar.maxSpeed=230
    println("max speed is ${myCar.maxSpeed}")

    println("model is ${myCar.myModel}")



}

class Car {
    //var owner:String   // in Kotlin we cannot assign a value to a class variable like this
    //so, we have to write lateinit before var.
    
    lateinit var owner: String
    val myBrand:String = "BMW"

        //custom getter
    get()
    {
       return field.toLowerCase()
    }
    var maxSpeed:Int=250
    get()= field
    set(value)
    {
        field = if(value>0) value else throw IllegalArgumentException("maxSpeed cannot less tha 0")
        //it gives us an illegal exceptional error that max speed cannot be zero
    }

    var myModel:String ="M5"
    private set //means available in the same class


    init {
        this.myModel= "M3"
        this.owner = "Rita"  //initialize the class variable owner

    }
}

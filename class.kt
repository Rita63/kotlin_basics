package com.example.kotlin

fun main(){
    var rita =Person("Rita","Bindal")  //object of class person
    var rb = Person()

}
//class Person (firstName: String,lastName:String)  //creating a class with two values first name and last name
class Person (firstName: String="Rita",lastName:String="Bindal")  //creating a class with two values first name and last name
{
    init {  //initializer ,it is used to initialize our object,.
        println("person created with " + "firstName= $firstName and lastname = $lastName")
    }

}

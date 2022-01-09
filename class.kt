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


//example
//Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.
//
//Use the initializer to print those details.
//
//Create three objects of that class in the Main function.
//
//Examples of phones would be:
//Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra

fun main(){
    var samsung=MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var lenovo=MobilePhone()
    var oppo=MobilePhone(brand = "oppo",model = "ultra max")
}
class MobilePhone(osName:String="android",brand:String="lenovo",model:String="max"){

init{

    println("phone details are " +"os name = $osName brand is= $brand model is= $model"  )
}}

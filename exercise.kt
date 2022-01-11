package com.example.kotlin

//Please extend our example of the MobilePhone class with
//Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.
//
//Then add a function
//"chargeBattery"
//Which needs details about how much was charged.
//
//It should print out how much battery the phone had before, how much was charged and how much it has now.
//Create an Object of the class and call this function. Charge the battery by 30.

fun main(){
    var Phone = MobilePhone("android","samsung","pro max",)

}

class Phone(osName: String, brand: String, model: String){
    private  var battery = 30
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}

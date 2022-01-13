package com.example.kotlin
fun main(){
    var myCar = car("A3","AUDI")
    var ecar= eCar("S-Model","Tesla",87.0)


    //polymorphism
    myCar.drive(200.0)
    ecar.drive(200.0)


ecar.chargerType = "Type 2" //we can reassign the variable value here
    ecar.extendedRange(200.0)
    ecar.drive()

}

//any class inherits from the any class
//superclass
open class car(var name:String,var brand:String){
  open  var range:Double=0.0   //open this property to override this

    fun extendedRange(amount:Double) {
        if(amount>0)
            range+=amount
    }
open fun drive(distance:Double){
    println("drove for $distance km")
}


}
//subclass of car class
class eCar(name: String, brand: String,batteryLife:Double) : car(name, brand){
override var range = batteryLife  *4
    var chargerType = "Type1"

    override fun drive(distance: Double) {
        println("drove for $distance km on electricity")
    }

    fun drive(){
        println("drove for $range km on electricity")
    }
}

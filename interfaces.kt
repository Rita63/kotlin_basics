package com.example.kotlin

//interfaces allows us to extend the functionalities of classes

fun main(){
    var myCar1= myCar(200.0,"A3","AUDI")
    var eCar1= electricCar(250.0,"S-Model","Tesla",87.0)





    eCar1.chargerType = "Type 2" //we can reassign the variable value here
   // eCar1.extendedRange(200.0)
  //  eCar1.drive()
    eCar1.brake()
    myCar1.brake()

    //polymorphism
   // myCar.drive(200.0)
  //  eCar1.drive(200.0)


}

//the class which use the property of this interface should have to override the class
interface Drivable{
    val max1Speed: Double
    fun drive():String  //drive func. of type string which will return a string type
    fun brake(){
        println("the drivable is breaking")
    }
}


//any class inherits from the any class
//superclass
//primary constructor

//we need to write the word override here because we are using the properties of interface here.
open class myCar(override val max1Speed:Double, var name:String,var brand:String):Drivable{

        open var range: Double = 0.0   //open this property to override this

        fun extendedRange(amount: Double) {
            if (amount > 0)
                range += amount
        }
        //override fun drive
        override fun drive():String="driving the interface drive"

        open fun drive(distance: Double) {
            println("drove for $distance km")
        }

    }

//subclass of car class
class electricCar(max1Speed: Double,name: String, brand: String,batteryLife:Double) : myCar(max1Speed,name, brand) {
    override var range = batteryLife * 4
    var chargerType = "Type1"

    override fun drive(distance: Double) {
        println("drove for $distance km on electricity")
    }

    override fun drive(): String {
        return "drove for $range km on electricity"
    }
   override fun brake()
    {
super.brake()
        //we use super keyword here because to call the brake func of super class
        println("break inside of electric car")

    }
}






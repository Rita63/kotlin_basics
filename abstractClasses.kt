package com.example.kotlin

//an abstract class cannot be instantiated(we cannot create objects of an abstract class)
//however we can inherit subclass from an abstarct class
//the member (properties and methods) of an abstract class are non-abstract unless we use the abstract keyword to make them abstract

// INTERFACES HAVE CONSTRUCTOR BUT ABSTRACT CLASS DOESNOT HAVE CONSTRUCTOR

abstract class Mammal(val name:String,val origin:String,val weight:Double){
    //THESE ARE(NAME,ORIGIN,WEIGHT) NON-ABSTRACT PROPERTIES
    
    abstract var maximumSpeed:Double  //ABSTRACT PROPERTY(MUST BE OVERRIDDEN BY SUBCLASS)
    //ABSTRACT METHODS (MUST BE IMPLEMENTED BY SUBCLASS)
    abstract fun run()
    abstract fun breath()

    //concrete(non-abstarct method)
    fun displayDetails(){
        println("name:$name,origin:$origin,weight:$weight, "+"max speed:$maximumSpeed")
    }
}
class Human(name: String,origin: String,weight: Double, override var maximumSpeed: Double):Mammal(name, origin,weight){
    override fun run() {
       println("run on 2 legs")
    }

    override fun breath() {
        println("breath through mouth or nose")
    }

}
class Elephant(name: String, origin: String, weight: Double, override var maximumSpeed: Double) :Mammal(name, origin, weight) {
    override fun run() {
        println("runs on 4 legs")
    }

    override fun breath() {
        println("breath through the trunk")
    }
}
fun main(){
    val human= Human("Rita","India",50.0,25.0)
    val elephant= Elephant("abc","india",600.0,25.0)
    
    human.run()
    elephant.run()
    human.breath()
    elephant.breath()
}

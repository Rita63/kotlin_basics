package com.example.kotlin

//subclass
//superclass
fun main(){

 //now create an object of child class and call myFunc

var myObj = child()
 myObj.myFunc()
}
//SUPERCLASS
open class Parent {      //we can use two modifier sealed or opened
 //opened means we can inherit sealed means we cannt inherit
var x =5

}
//SUBCLASS
class child:Parent(){
 fun myFunc(){
  println(x)   //x here is inherited from superclass Parent
 }
}

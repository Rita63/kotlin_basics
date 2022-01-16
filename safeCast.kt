package com.example.kotlin
//safe cast operator as?
fun main(){
    val location:Any = "kotlin"
    val safeInt:Int?= location as? Int   //it will give output null because string cannt be in int
    val safeString:String? =location as? String
    println(safeInt)
    println(safeString)
}

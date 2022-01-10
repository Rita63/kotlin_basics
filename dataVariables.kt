package com.example.kotlin

fun main(){
var rita = student("Rita","BindaL",23)
    rita.age=22
    println("rita age is${rita.age}")
    var dev = student()
    dev.hobby = "netflix"
    dev.stateHobby()
    rita.hobby="skateboard"  //if we want to change the hobby we can do it like this
    rita.stateHobby()
}

    class student(firstName:String="dev",lastName: String="dev"){

        //member variables
          var firstName:String?=null
        var age: Int?=null
        var hobby:String= "badminton"
    init {
        this.firstName=firstName
println("first name is "+ "$firstName $lastName")
    }

        //secondary constructor-- a constructor is also a member

        constructor(firstName: String,lastName: String,age:Int):this(firstName,lastName) {
            this.age = age
        }


        //member functions
        fun stateHobby(){
            println("${firstName}\'s hobby is $hobby")
        }
}

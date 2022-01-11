package com.example.kotlin

data class User(val id:Long,var name:String)  //primary constructor must have atleast perimeter

fun main(){

    val user1= User(1,"Rita") //creating object of data class "User"
    val name = user1.name
    println(name)
    user1.name = "Riya" //reassign a name
    val user2 = User(2,"RB")

  //  println(user1.equals(user2)) //for comparing user 1 to user 2
    println(user1==user2) //we can also use this for comparing

    println("user details:$user1")

    //copy function
    val updateUser = user1.copy(name="Rita Bindal") //if we want to change the name in updated user
    println(updateUser)

    //component function
    println(updateUser.component1())  //to get its 1st component , it will print 1
    println(updateUser.component2())  //to get its 2nd component
    
    

}

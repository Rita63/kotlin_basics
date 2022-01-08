package com.example.kotlin

fun main(){
    /*for(num in 1..20)
        println("$num")
}
for(i in 10 downTo 1)
    println("$i")
}

for(i in 1 until 10 step 2)
    println("$i")
}*/
//Write a for loop that runs from 0 to 50
//Once it's at 41 it should write "IT'S OVER 40!!!"

/*for(num in 1..50){
    if(num==41)
        println("its over 40")}

}*/
//Write a while loop that checks the humidity (not the humidityLevel).
// The variable humidityLevel starts at 80. The variable humidity is initialized with "humid".
// If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
//Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }}






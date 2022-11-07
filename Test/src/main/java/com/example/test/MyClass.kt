package com.example.test

fun main() {
//    val car = Car(color = "Red", model = "jsdlf")
//    println(car)

    val truck = Truck(color = "Magenta", model = "kjnm")
    truck.speed(16, 100)
}

open class Car(var color: String, var model: String) {
    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed, max speed is $maxSpeed.")
    }
}

class Truck(color: String, model: String) : Car(color, model)
package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")
    println(car)
}

data class Car(var color: String, var model: String) {
    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed, max speed is $maxSpeed.")
    }
}

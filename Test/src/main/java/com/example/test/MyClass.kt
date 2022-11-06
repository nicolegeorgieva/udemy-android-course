package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")
    car.speed(minSpeed = 30, maxSpeed = 130)
}

class Car(var color: String, var model: String) {
    init {
        if (color == "Green") {
            println("Yayy Green!")
        } else {
            println("$color is not Green.")
        }
    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed, max speed is $maxSpeed.")
    }
}

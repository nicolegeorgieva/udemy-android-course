package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")
    println(
        "Car color: ${car.color}, model: ${car.model}"
    )

    val truck = Truck(color = "Magenta", model = "kjnm")
    truck.drive()
    truck.speed(16, 100)
}

open class Car(var color: String, var model: String) {
    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed, max speed is $maxSpeed.")
    }

    open fun drive() {
        println("Drive...vrooommm")
    }
}

class Truck(color: String, model: String) : Car(color, model) {
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck full speed: $fullSpeed.")
    }

    override fun drive() {
        println("Vrooommm...like a truck!")
    }
}
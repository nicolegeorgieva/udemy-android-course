package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")

    print("${car.color} ${car.model}")
}

class Car(var color: String = "Blue", var model: String = "xmd") {
}

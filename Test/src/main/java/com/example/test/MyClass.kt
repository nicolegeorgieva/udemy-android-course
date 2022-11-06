package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")

    print("${car.color} ${car.model}")
}

class Car(color: String = "Blue", model: String = "xmd") {
    var color: String = color
    var model: String = model
}
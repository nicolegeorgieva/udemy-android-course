package com.example.test

fun main() {
    val car = Car(color = "Red", model = "jsdlf")
}

class Car(var color: String, var model: String) {
    init {
        if (color == "Green") {
            println("Yayy Green!")
        } else {
            println("$color is not Green.")
        }
    }
}

package com.example.test

fun main() {
    val button = Button("Back Button")
    button.onClick("This is a Back Button.")
}

class Button(val label: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's a message: $message")
    }
}

interface ClickEvent {
    fun onClick(message: String)
}
package com.example.test

fun main() {
    val button = Button("Back Button")
    button.onClick("This is a Back Button.")

    val character = Character("Morgana")
    character.onClick("This is Morgana!")
}

class Button(val label: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's a message: $message")
    }
}

class Character(val name: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message: $message")
    }
}

interface ClickEvent {
    fun onClick(message: String)
}
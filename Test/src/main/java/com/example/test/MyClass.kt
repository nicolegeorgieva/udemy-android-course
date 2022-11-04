package com.example.test

fun main() {
    print(applyDiscount(10.0, 20, true))
}

fun applyDiscount(price: Double, discount: Int, valid: Boolean): Double {
    return if (valid) {
        price * (1 - discount / 100.0)
    } else {
        price
    }
}

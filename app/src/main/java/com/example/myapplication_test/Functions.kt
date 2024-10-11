package com.example.myapplication_test

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}
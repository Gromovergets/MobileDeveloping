package com.example.mobiledev

fun Main1() {
    println("Введите первое чиило")
    val num1: Double = readln()?.toDouble() ?: 0.0

    println("Введите первое чиило")
    val num2: Double = readln()?.toDouble() ?: 0.0

    println("Введите первое чиило")
    val num3: Double = readln()?.toDouble() ?: 0.0

    if(num1==num2||num1==num3||num2==num3){
        println("yes")
    }

}
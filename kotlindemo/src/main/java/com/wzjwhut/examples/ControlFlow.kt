package com.wzjwhut.examples

import java.lang.Integer.parseInt

val a = 10
val b = 11
var max = if (a > b) a else b



fun main(args:Array<String>){
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    max = 3
    when (max) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 0 or x == 1")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    var x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 0 or x == 1")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    var s = "3"
    when (x) {
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }

    x = 11
    var validNumbers = arrayOf(1, 2, 3, 4, 11)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }




}
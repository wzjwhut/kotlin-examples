package com.wzjwhut.examples

var d = 1.0
var f = 2.0f
var str =
        """
        line 1
        line 2
        """
val i:Long = 123


fun main(args: Array<String>) {
    println(d.javaClass)
    println(d + f)
    println(str.length)
    println(str.javaClass)
    println(i)
    println(i.javaClass)
    println(Integer.toHexString(i.toInt()))
    println(i.toString(36))
    println(i.times(2))
    println(i * 2)
}
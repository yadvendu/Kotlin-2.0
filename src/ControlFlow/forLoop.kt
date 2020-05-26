package ControlFlow

fun main() {
    for (i in 0..6) {
        println(i)
    }

    println()
    for (i in 1..10 step 3) {
        println(i)
    }

    println()
    for (i in 5 downTo 1) {
        println(i)
    }

    println()
    for (i in 10 downTo 1 step 3) {
        println(i)
    }

    println()
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (num in numbers) {
        println(num)
    }

    println()
    for (i in numbers.indices){
        println(numbers[i])
    }

    println()
    for ((index,value) in numbers.withIndex()){
        println("Element at index $index is $value")
    }

    val name = "Yadu"

    println()
    for (i in name){
        println(i)
    }

    println()
    for (i in name.indices){
        println(name[i])
    }

    println()
    for ((index,value) in name.withIndex()){
        println("Character at index $index is $value")
    }
}
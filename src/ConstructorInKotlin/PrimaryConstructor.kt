package ConstructorInKotlin

/**
 * Traditional way of initialising the class variables
 * Init blocks are executed when object is created
 * Kotlin can have more than one init block and is executed in the order they are declared
 * No matter where declared, as soon object is created all init blocks are first executed
 * init block is called just after primary constructor
 */
class PrimaryConstructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
        println("Inside first init block")
    }

    fun printInfo() {
        println("Name:$name Age:$age")
    }

    init {
        println("Inside second init block")
    }
}

/**
 * Concise way of initialising class variables
 */

class PrimaryConstructorConcise(val name: String, val age: Int) {
    fun printInfo() {
        println("Name:$name Age:$age")
    }
}

fun main() {
    println("--Traditional way--")
    val obj = PrimaryConstructor("Yadu", 25)
    obj.printInfo()
    println()
    println("--Concise way--")
    val obj1 = PrimaryConstructorConcise("Prateek", 25)
    obj1.printInfo()
}
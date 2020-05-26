package ControlFlow

/**
 * else is optional with when , when it it is not used as expression but is compulsory if used as expression
 * With enum and sealed classes when becomes exhaustive and no need of else statement
 */
fun main(args: Array<String>) {
    val x = 3

    when (x) {
        1 -> println(1)
        2 -> println(2)
        else -> println(3)
    }

    when (x) {
        1, 2 -> println(1)
        3, 4 -> println(3)
        else -> println("Notfound")
    }

    when (x) {
        in 1..10 -> println("first block")
        in 2..20 -> println("second block")
        else -> print("No block")
    }

    checkx(2)
    val booleanValue = checky(2)
    println(booleanValue)
}

fun checkx(x: Int) = when (x) {
    1 -> println(1)
    2 -> println(1)
    else -> println("Not present")
}

fun checky(y: Int): Boolean = when (y) {
    1 -> true
    else -> false
}






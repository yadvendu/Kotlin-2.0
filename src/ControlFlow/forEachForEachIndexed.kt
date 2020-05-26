package ControlFlow

fun main(){
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    list.forEach {
        println(it)
    }

    println()
    list.forEachIndexed { index, i ->
        println("Index $index Value $i")
    }
}
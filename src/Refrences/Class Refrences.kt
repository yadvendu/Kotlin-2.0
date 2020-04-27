package Refrences

open class A(){
    var a = 10
}

class B():A(){

}

fun main(args:Array<String>){
    val abc = A::class
    var obj:A = B()
    println(abc)
    println(obj::class)

    println()
    println("--Let's check some functiona of class refrence")
    println(abc.isAbstract)
    println(abc.isFinal)
}
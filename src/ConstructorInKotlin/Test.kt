package ConstructorInKotlin

open class Test {
    open fun first(){
        println("Inside base class")
    }
}

open class Child1 : Test(){
    override fun first() {
        println("Inside child class 1")
    }
}

class Child2 : Child1(){

}

fun main(){
    val obj = Child2()
    obj.first() // so function first not present in child 2 class so it goes to it parent class
    //Therefor, override moves from bottom to top
}
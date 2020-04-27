package DepedencyInjectionInAndroid

/*
Example without depedency injection:-
1.Tightly coupled
2.Hard for testing
3.Refactoring of code is tedious
 */
fun main(args:Array<String>){
    val car = Car()
    car.startEngine()
}
class Car(){
    private val obj = ManualEngine()
    private val obj1 = SelfStartEngine()
    fun startEngine(){
        obj.typeOfStart()
        obj1.typeOfstart()
    }
}

class ManualEngine(){
    fun typeOfStart(){
        println("Start engine manually")
    }
}

class SelfStartEngine(){
    fun typeOfstart(){
        println("Start engine with self start")
    }
}
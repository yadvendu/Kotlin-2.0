package DepedencyInjectionInAndroid

fun main(args:Array<String>){
    var engObj = Engine()
    var carObj = NewCar(engObj)
    carObj.startEngine()
}
class NewCar(var obj:Engine){
    fun startEngine(){
        obj.typeOfStart()
    }
}

class Engine(){
    fun typeOfStart(){
        println("Start engine manually")
    }
}

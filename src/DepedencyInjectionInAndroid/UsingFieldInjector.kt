package DepedencyInjectionInAndroid

fun main(args:Array<String>){
    var car = BrandCar()
    car.engine = BrandEngine()
    car.startEngine()
}
class BrandCar(){
    lateinit var engine:BrandEngine
    fun startEngine(){
       engine.typeOfstart()
    }
}

class BrandEngine(){
    fun typeOfstart(){
        println("Start engine with self start")
    }
}
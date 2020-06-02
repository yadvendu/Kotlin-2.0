package ConstructorInKotlin

/**
 * Secondary constructor is used when we want to perform additional logic
 * We can directly declare a class property inside secondary constructor
 * To use a property of class inside secondary constructor declare it outside secondary constructor
 * and initialize it using this keyword
 * whenever a primary constructor is present then secondary constructor has to call it using this keyword
 * First primary constructor is called the primary constructor
 * Below is a complete example with constructor overloading and constructor chaining
 * Constructor chaining is always from top to bottom
 * Overriding is from bottom to top
 * Test class is prepared to understand the override behaviour
 */
                           //primary constructor
class SecondaryConstructors(val operationType:String) {
    var a:Int? = null
    var b:Int? = null

    init {
        println("Init block called")
    }

    //secondary constructor 1
    constructor(a:Int,b:Int,operationType: String):this(operationType){
        this.a = a
        this.b = b
        println("$operationType of two numbers is ${a+b}")
    }

    //secondary constructor 2
    constructor(operationType: String,a: Int,b: Int,operationStatus:String):this(a,b,operationType){
        println("$operationType is $operationStatus")
    }

    constructor(c:Int,operationType: String):this(operationType){
        println("Value of c:$c")
    }
}

fun main(){
    println("Example of constructor chaining")
    SecondaryConstructors("Addition",10,20,"Completed")
    /**
     * Here first secondary constructor 2 is called, which then calls the secondary constructor 1 and
     * secondary constructor 1 calls primary constructor
     * So order in each is called is as below :-
     * 1.Primary Constructor
     * 2.init Block
     * 3.Secondary Constructor 1
     * 4.Secondary Constructor 2
     */

    //Below is example of constructor overloading
    println()
    println("Example of constructor overloading")
    SecondaryConstructors(10,"Addition")
}
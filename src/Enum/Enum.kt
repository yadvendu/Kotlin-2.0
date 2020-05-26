package Enum
/*
Points to Remember :-
1.Kotlin enum are classes
2.Enum constants aren’t just mere collections of constants- these have properties, methods etc
3.Each of the enum constants acts as separate instances of the class and separated by commas.
4.Enums increases readability of your code by assigning pre-defined names to constants.
5.An instance of enum class cannot be created using constructors bcz constructors in enum are private

*Properties –
1.ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
2.name: This property stores the name of the constant.

*Methods –
1.values: This method returns a list of all the constants defined within the enum class.
2.valueOf: This methods returns the enum constant defined in enum, matching the input string.
If the constant, is not present in the enum, then an IllegalArgumentException is thrown.
 */

enum class DAYS(val number:Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3)
}

fun main(args:Array<String>){
    println("--Playing with enum--")
    System.out.println(DAYS.MONDAY.number)

    println()
    println("--Using properties and methods provided in enum--")
    for (days in DAYS.values()){
        println("${days.ordinal}:${days.name}")
    }

    println()
    println("--Enum using when--")
    when(DAYS.TUESDAY){
        DAYS.MONDAY -> {
            println("Today is monday")}

        DAYS.TUESDAY -> {
            println("Today is tuesday")}

        DAYS.WEDNESDAY -> {
            println("Today is wednesday")}
    }
}
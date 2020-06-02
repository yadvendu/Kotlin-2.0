package NullSafety

fun main(){
    var s1 = "prateek"
   // s1 = null -> compiler will throw error because a non-nullable type can not take null value

    var s2:String? = null
    s2 = null // compiler dont thow and error and at run time no null pointer exception occur

    if (s2 != null){
        s2.length
    }

    //above statement converted into one line by safe call operator
    s2?.length

    //Let can be used when we need to execute some operation only when the value is not null

    s2?.let {
        it.toInt() + 1
    }
    //means s2 if not null then add 1 to it

    //use of another scope operator when we want to do some additional work
    s2?.toInt()?.plus(1)
    println(s2)

    //both line can be combined in one line using let and also
    s2?.let { it.toInt() }?.also { println(s2.toString()) }

    var newname:String? = "Yadu"
    if (newname != null){
        newname = "Yadvendu"
    }else{
        newname = "Yadu"
    }

    //it can be done in one line using elvis operator
    var fruits:String? = "Mango" ?: "Unknown" //same as above
    var newfruits:String? = "Mango" ?: throw IllegalArgumentException("Fruit name is wrong")
    //so as above we can use throw statement also with elvis operator
}
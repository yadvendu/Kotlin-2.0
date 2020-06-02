package ReturnAndJumps

fun main(){
    var count = 0
    var newCount = 0
    var continueCount = 0

    for (i in 0 until 4){
        if (i == 2)
            continue // it skips the current iteration and starts with next iteration
        count = count + 1
    }
    println(count)

    loop@ for (i in 0 until 3){
        for (j in 0 until 3){
            if (j == 2)
                break@loop // it breaks from wherever lable is mentioned
            newCount = newCount + 1
        }
    }
    println(newCount)

    loop@ for (i in 0 until 4){
        for (j in 0 until 3){
            if (j ==2)
                continue@loop //it scontinue from the position where label is mentioned
            continueCount = continueCount + 1
        }
    }

    println(continueCount)
}
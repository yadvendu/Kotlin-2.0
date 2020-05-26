class CompanionObjectInKotlin {
    companion object {
        var instance: CompanionObjectInKotlin? = null
        fun instance():CompanionObjectInKotlin{
            if (instance == null){
                instance = CompanionObjectInKotlin()
            }
            return instance!!
        }
    }
    fun callMe() = println("Use of companion object")
}

fun main(args: Array<String>) {
    CompanionObjectInKotlin.Companion.instance().callMe()
}
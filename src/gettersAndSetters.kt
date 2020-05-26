class Company() {
    var companyName: String = ""
        get() = field
        set(value) {
            if (value.length < 4)
                field = "Error"
            else
                field = value
        }

    var noOfEmployess: Int = 0
        get() = field
        private set

    fun setNoOfEmployees(number:Int){
        noOfEmployess = number
    }

    val totalInfo:String
    get() = "$companyName has $noOfEmployess employees"
}

fun main(args: Array<String>) {
    val c = Company()
    c.companyName = "PwC USA"
//    c.noOfEmployess = 100 : Will throw an error if we try to set the value bcz
//    the setter is made private in the class
    c.setNoOfEmployees(10000)
    println(c.companyName)
    println(c.noOfEmployess)
    println(c.totalInfo)
}
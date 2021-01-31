fun main(args: Array<String>) {

    var a : Int? = 10
    println(a?.plus(3))
    println(a?.minus(3))
   println( a?.times(3) )
    println(a?.div(3))
    println(a?.rem(3))

    print("Enter a number")
    val userInput = readLine()
    val convert_Double = userInput?.toDouble()?.times(7)
    val seven : String? = convert_Double?.toString()
    println("number ${seven} length ${seven?.length}")

    val catName : String? = null
    println(catName?:"This cat has no nAME")
    println()

    var catN: String? = null
    catN = "Ho"
    println(catN?:"This...")

    println(catN?.length)



}

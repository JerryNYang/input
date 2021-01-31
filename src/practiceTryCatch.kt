fun main(args: Array<String>) {

    println("Enter a number: ")
    val input = readLine()
    try
    {
        val number = input?.toInt()
        println("$number * 5 = ${number?.times(5)}")

    }
    catch (e:Exception)
    {
        println("the value '$input' is not a number")
        e.printStackTrace()
    }
}
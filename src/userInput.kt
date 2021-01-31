import kotlin.random.Random

fun main(args: Array<String>)
{
    println("Input a number")
    val userInput = readLine()?:""
    println("Double is ${userInput.toInt() * 2}")
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20,30))


}
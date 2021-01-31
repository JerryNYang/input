fun main(args: Array<String>) {
 println(multiply(5))
    println(multiply(7,9))

    sayHi("John")
    sayHi(listOf("Al" , "Bob", "Tom"))
}

fun multiply(num: Int):Int
{
    return num*2
}

fun multiply(number: Int, multiplier: Int):Int
{

    val result:Int = number * multiplier

    return result
}

fun sayHi(person:String)
{
    println("Hi $person")
}

fun sayHi(people:Collection<String>)
{
    for (person in people)
    {
        println("Hi there $person")
    }
}
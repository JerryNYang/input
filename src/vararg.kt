fun main(args: Array<String>) {

    sayHi("Hitomi", "Joe", "bob")
    sumInt(5,4)
    sumInt(2,3)
    sumInt(2,4,5)
}

fun sayHi(vararg names : String)
{
    for (name in names)
    {
        println("Hi, $name")
    }
}

fun sumInt(vararg  nums: Int)
{
    var sum = 0
    for(number in nums)
    {
        sum += number

    }

    println("Sum: $sum")
}
fun main(args: Array<String>) {
    for(i in 1..3)
    {
        sayHello()
        nameAge()
    }

    val people : List<String> = listOf("Bob", "Tom", "Ray")
    sayHello(people)
    double()
    println("pi: ${pi()}")
}

fun sayHello()
{
    println("Hello")
}

fun nameAge()
{
    val named : String


    println("Enter the name: ")
    named = readLine()?:""

    println("Enter age: ")
    val age  = readLine()?:""
    val ageInt = age.toInt()

    println("Age: $ageInt")
    println("Name: $named")

}

fun sayHello(people:Collection<String>)
{
    for(person in people)
    {
        println("Hello $person")
    }
}

fun double(num : Int = 88)
{
    println("num: $num")
}

fun pi (): Double
{
    return 3.14
}
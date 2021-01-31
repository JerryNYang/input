fun main(args: Array<String>) {

    var people  = listOf("Joe", "Sam", "Will", "Al", "Rob")

    for(person in people)
    {
        val greeting = personalizedGreeting(person)
        println(greeting)

    }

}

fun personalizedGreeting(person: String): String
{
    val greeting = when(person[0])
    {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi, $person"

    }
    return greeting
}
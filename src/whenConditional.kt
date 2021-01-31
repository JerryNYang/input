fun main(args: Array<String>) {

    var animal = "crocodile"
    var action : String = ""
    when(animal)
    {
        "cat" -> {
            action = "pet it"
        }

        "dog" -> {
            action = "feed it"
        }

        else ->
        {
            action = "google it"
        }
    }
    println("When you meet an $animal. You should $action")

        var result : String = ""
        val number = 2335
        when(number % 2)
        {
            0 -> {
                println("number is even")
            }

            1 -> {
                println("number is odd")
            }
        }

        // when can return a statement(a value)

        val name = "John"
        when(val length  = name.length)
        {
            in 1..5 -> println("A name with $length character is short")
            in 6..10 -> println("A name with $length character is medium")
            else -> println("A name with $length character is long")

        }


}
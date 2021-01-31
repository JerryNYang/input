fun main(args: Array<String>) {

    if(326 / 72 * 15 + 93 % 13 == 62)
    {
        println("Math is hard")

    }

    else
    {
        println("Math is easy")
    }

    // in keyword
    val favoritePet : String  = "dog"
    val avaiablePets = listOf<String>("dog", "cat", "horse")
    if(favoritePet in avaiablePets)
    {
        println("We have your best friend")

    }

    else
    {
       println("Sorry, $favoritePet is not available")
    }

    // !in keyword
    println("Enter your preffered coffee: ")
    val coffee = readLine()?:""
    val availabeCoffee = listOf("capuccino", "mocha")
    if(coffee !in availabeCoffee)
    {
        println("Sorry we don't have your coffee")
    }

    else
    {
        println("$coffee is avaiable")
    }


    // range and !in
    println("Enter a number: ")
    val input = readLine()?:"0"
    val number = input.toInt()
    if(number !in 0..9)
    {
        println("Your number is not a single digit")
    }


    println("Enter an age: ")
    val input_ = readLine()?:"0"
    val number_ = input_.toInt()
    val age : Int
    if(number_ == 0)
    {
      age = 1
        println("you are $age")

    }

    else if(number_ in 1..12)
    {
        println("You are a child")
    }

    else if(number_ in 13..17)
    {
        println("You are a teen")
    }

    else
    {
        println("You are an adult")
    }





}
fun main(args: Array<String>) {

    val animals =  arrayListOf<String>()
    for (i in 1..5)
    {
        println("Please enter an animal")
        val input = readLine()?:""
        if(input == "snake")
        {
            println("Sorry we cannot accept snakes")
            break
        }
        animals.add(input)
        println("Current animals $animals")

    }

    val clients = listOf<String>("Anna", "Charles","Bob", "James", "David")
    for (client in clients)
    {
        if(client[0] == 'C')
        {
            continue
        }
        println("Hello, $client")
    }


    while(true)
    {
        println("Enter an age")
        val input = readLine()?:""
        if(input == "stop")
        {
            break
        }
        val ageInput = input.toInt()
        if(ageInput < 18)
        {
            println("You are not allowed!")
            continue
        }


            println("Hello, $ageInput")


    }
}
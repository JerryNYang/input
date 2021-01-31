fun main(args: Array<String>) {

    println("Please enter a year")
    val input = readLine()?:"2020"
    val year = input.toInt()

    for (i in 1..12)
    {
        val message =  when(i)
        {
            1 -> "January has 31 days"
            2 -> if (year % 4 == 0)
            {
                "febraury has 29 days"
            }
            else
            {
                "February has 28 days"
            }

            3 -> "March has 31 days"
            4 -> "April has 30 days"
            5 -> "May has 31 days"
            6 -> "June has 30 days"
            7 -> "July has 31 days"
            8 -> "August has 31 days"
            9 -> "September has 30 days"
            10 -> "October has 31 days"
            11 -> "November has 30 days"
            else -> "December has 31 days"


        }
        println(message)
    }


    for(i in 10 downTo 0)
    {
        println(i)
        when(i)
        {
            9 -> println("Start your engine")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }

    println("\n")
    for(i in 10 downTo 0 step 3)
    {
        println(i)
    }

}
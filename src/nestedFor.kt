fun main(args: Array<String>) {

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            print  ("$i, $j \t")
        }

        println()
    }

    val matrixSize = 9

    for(i in 0..matrixSize)
    {
        for(j in 0..matrixSize)
        {
            if(i == j)
            {
                print("diagonal\t")
            }

            else
            {
                print("$i, $j \t\t")
            }

        }

        println()
    }

    // right triangle smiley faces
    for(i in 1..10)
    {
        for(j in 1..i)
        {
          print("\uD83D\uDE00")
        }
        println()
    }


    println("Please enter the matrix size")
    val input = readLine()?:""
    val size = input.toInt()

    for(i in 1..size)
    {
        for(j in 1..size)
        {
            when(i * j % 3)
            {
                0 -> println("\uD83D\uDE00\t")
                1 -> println("\uD83E\uDD28\t")
                2 -> println("\uD83D\uDE31\t")
            }
        }
        println()
    }
}
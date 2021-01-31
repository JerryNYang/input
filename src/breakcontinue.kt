fun main(args: Array<String>) {

    var onlyEvenNums = arrayListOf<Int>(2,34,56,74,3,34,55,5555,542,22,33)

    println("Continue")
    for(number in onlyEvenNums)
    {
        if(number % 2 != 0)
        {
            continue
        }
        println("Half of $number is ${number / 2}")
    }

    var onlyEvenNums_2 = arrayListOf<Int>(2,11,111,1122,34,56,74,3,34,55,5555,542,22,33)

    println("Break")
    for(number in onlyEvenNums_2)
    {
        if(number % 2 != 0)
        {
            break
        }
        println("Half of $number is ${number / 2}")
    }
}
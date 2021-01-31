fun main(args: Array<String>) {

    val numbers : ArrayList<Int> = arrayListOf(44,5, 7, 333,664,888,11,12)
    println(numbers)
    val newNumbers: ArrayList<Int> = update(numbers){number -> number / 10}
    println(newNumbers)
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int>
{
    for(i:Int in 0..numbers.size-1)
    {
        if(numbers[i] % 2 == 0)
        {
            numbers[i] = lbd(numbers[i])
        }

    }
    return numbers
}
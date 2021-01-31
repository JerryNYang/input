fun main(args: Array<String>) {

    for(i in 1..12) {
        val month = when (i) {
            1 -> "january"
            2 -> "febraury"
            3 -> "march"
            4 -> "april"
            5 -> "may"
            6 -> "june"
            7 -> "july"
            8 -> "august"
            9 -> "september"
            10 -> "october"
            11 -> "november"
            else -> "december"
        }
        println("Month #$i is $month")
    }

    var total : Int = 0
    for(i in 1..100)
    {
        total += i
    }

    println("total $total")

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna",6))




}
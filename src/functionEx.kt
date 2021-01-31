fun main(args: Array<String>) {

    val sum = add(3,5)
    for(i in 1..3)
    {
        println("Sum: $sum")
    }

    val product = hashMapOf<String, Double>(Pair("shoes", 29.33), Pair("jacket", 29.33),Pair("socks", 11.33),Pair("buckles", 55.33))
    for(item in product.keys)
    {
       val tax = addTax(product[item])
        // print abc order
        println("$item cost: $tax")
    }
}

fun add(num1:Int, num2: Int) : Int
{
    return num1 + num2
}

fun addTax(price: Double?):Double?
{
    return price?.times(1.2)
}
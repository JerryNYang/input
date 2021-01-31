fun main(args: Array<String>) {

    val numbers = setOf<Int>(33,44,55)
    println(numbers)
    val numbers2 = setOf<Int>()
    println(numbers2)

    val numbers3 = setOf(4 , 5 ,455, null,55,666,55, 7788,542,33)
    println(numbers3)

    val num = hashSetOf<Int>(3,5,7,6)
    println(num)

    val num2 = hashSetOf(3,5,7,null,6)
    println(num2)

    val number = setOf(764,81)
    num.addAll(number)
    num.remove(81)
    num.removeAll(number)
    println(num)



}
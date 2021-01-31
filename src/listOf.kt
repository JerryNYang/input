fun main(args: Array<String>) {
    val nums = listOf<Int>(3,4,5,56)
    println(nums)

    val num_1 = listOf<Int>(33,44,55,55)
    println(num_1)

    val num_11 = listOf("sd","A",null,null)
    println(num_11)

//
    println(num_1[3])
    println(num_1.get(3))
    println(num_1.size)

    // ArrayList

    var num: ArrayList<Int> = arrayListOf(11,22,33)
    println(num)

    var numMore : ArrayList<Int> = arrayListOf(5,4,3)
    numMore.addAll(num)
    println(numMore)

     numMore.removeAll(num)
    println(numMore)

    var animal : ArrayList<String> = arrayListOf("cat", "dog", "rat")
    println(animal.size)
    println(animal)
    println(animal.get(1))







}
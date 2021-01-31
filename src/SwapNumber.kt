fun main(args: Array<String>) {

    var num1 : Double = 4.0
    var num2 : Double = 55.0



    var temp : Double = num1
    num1 = num2
    num2 = temp

    println("num1: $num1")
    println("num2: $num2")

    println("Enter number 1: ")
     var number1: Double = readLine()!!.toDouble()
    println("Enter number 2: ")
     var number2: Double = readLine()!!.toDouble()

        temp = number1
        number1 = number2
        number2 = temp

    println("number 1: $number1")
    println("number 2: $number2")








}
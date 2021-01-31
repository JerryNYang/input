fun main(args: Array<String>) {
   print("Enter name: ")
    val name: String = readLine()!!.toString()
    print("Enter age: ")
    val age: Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val gpa: Double = readLine()!!.toDouble()

    println("----- Student Info ---- ")
    println("My name is $name")
    println("My age is $age")
    println("My GPA is $gpa")

}
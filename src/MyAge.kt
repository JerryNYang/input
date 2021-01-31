import java.util.*

fun main(args: Array<String>) {

    print("Enter Year of Birth: ")
    val yearOfBirth : Int = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age : Int = yearInDevice - yearOfBirth
    print("You are $age years old")
}
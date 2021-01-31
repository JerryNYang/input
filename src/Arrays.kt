/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    //println("Hello, world!!!")

    val cat : Float = 5F
    println(cat)

    val myARRAY = arrayOfNulls<String>(4)
    myARRAY[0] = "2"
    myARRAY[1] = "44"
    myARRAY[2] = "32323"
    myARRAY[3] = "777"

    println(myARRAY[3])

    val myNUMARRAY = intArrayOf(11,222,3444,331)
    println(myNUMARRAY.size)
    println(myNUMARRAY.get(0))

    // ArrayList
    val myMUSIC = ArrayList<String>()
    myMUSIC.add("MJ")
    myMUSIC.add("Joe")
    println(myMUSIC)

    myMUSIC.add(1, "Kirk")
    println(myMUSIC)

    // sets
    val mySET = HashSet<String>()
    mySET.add("Kirk")
    mySET.add("Kirk")

    // this kirk has space compare to the other set items
    // memory managements
    mySET.add("Kirk ")

    println(mySET.size)

    // maps (key,value)... dictionary
    val myHASHMAP = HashMap<String,String>()
    myHASHMAP.put("name", "JD")
    myHASHMAP.put("instrument", "guitar")
    println(myHASHMAP["instrument"])
    println(myHASHMAP["name"])


    // switch statement (kotlin)
    var day = 1
    var dayString = ""

    when(day)
    {
        1 -> dayString = "Monday"
        2 -> dayString = "tuesday"
        else ->
        {
            dayString = "SUNDAY"

        }
    }

    println(dayString)


    // for loop
    val myNumber : IntArray = intArrayOf(12,15,18,24,36)
    val q = myNumber[0] / 3 * 5

    // for loop
    println("\n\nZ")
    for(number in myNumber)
    {
        val z = number / 3 * 5
        println(z)
    }


    // for loop

    println("\n\nY")

    for(i in myNumber.indices)
    {
        val Y = myNumber[i]/3 * 5
        println(Y)
    }

    // for loop
    println("\n\nA")

    for(a in 0..9)
    {
        val B = a * 10
        println(B)
    }

    // while loop
    println("\n\nY2")
    var Y2 = 0
    while (Y2 < 10)
    {
        val X = Y2 * 10
        println(X)
        Y2++
    }

}
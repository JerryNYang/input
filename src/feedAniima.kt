fun main(args: Array<String>) {

    feedAnimals("Dog")
    feedAnimals(listOf("cat","dog", "pig", "snake"))
    printSize(8)
    printSize("crocodile")

}


fun feedAnimals(pet : String)
{
    println("Hi, $pet")
}

fun feedAnimals(pets: Collection<String>)
{

    for(pet in pets)
    {
        println("Hi, there $pet")
    }

}

fun printSize(size:String)
{
    println("message size of $size: ${size.length}")
}
fun printSize(size:Int)
{
    var message = ""
    for (i in 1..size)
    {
        message += "a"
    }
    println("message: $message")
}
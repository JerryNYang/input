fun main(args: Array<String>) {

    listAnimals()
}

fun listAnimals()
{
    fun listOneAnimal(animal: String)
    {
        println("I have a $animal")
    }
    val animals = listOf<String>("cat", "dog", "lion")
    for(animal in animals)
    {
        listOneAnimal(animal)
    }
}
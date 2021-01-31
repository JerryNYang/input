fun main(args: Array<String>) {
    val names:ArrayList<String> = arrayListOf("Sam", "Joe", "David", "Mark")

    // Lambda Function
    val myLambda: (String) -> Unit = {name: String -> println("Hello $name ")}
    sayHello(names,myLambda)

}

// Lambda Function
fun sayHello(names:ArrayList<String>, doSomething:(String) -> Unit)
{
    for(name:String in names){

        doSomething(name)
    }
}


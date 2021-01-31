fun main(args: Array<String>) {

    product("Shoes", 22.22)

    val mapOfproducts = mapOf<String,Double>(Pair("socks",3.33), Pair("hats",55.33), Pair("shirts",9.11))
    product(mapOfproducts)
}

fun product(name:String,price:Double?)
{

    println("Product:$name Price:${price?.times(1.2)}")
}

fun product(namePrice:Map<String, Double>)
{
  for((k,v) in namePrice)
  {
      println("product: ${k} Price:${v}")
  }
}
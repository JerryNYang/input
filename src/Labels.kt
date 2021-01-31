fun main(args: Array<String>) {

    // labels similar to goto
    loop@for(i in 1..10)
    {
        for(j in 1..10)
        {
            // break out of 3s
            if(i % 3 == 0)
            {
                break@loop
            }
            println("$i, $j")
        }
    }


}
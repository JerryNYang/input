fun main(args: Array<String>) {

    println("please enter a number")
    val input = readLine()?:""
    val number = input.toInt()

    var i = 0
    while(i < number)
    {
        if(i % 7 == 0)
        {
            println("$i is divisible by 7")
        }
        i++
    }

    var puzzlePieces = 20
    var piecesPlaced = 0

    do {

        piecesPlaced++
        println("Placed piece #$piecesPlaced")

    }while(piecesPlaced < puzzlePieces)

    var k = 0
    var m = 0
    while (k <= 10)
    {
        while (m <= 10)
        {
            println("$k, $m\t")
            m++
        }

        k++
        m = 0

    }

}
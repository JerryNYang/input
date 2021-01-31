fun main(args: Array<String>) {

    var puzzlePieces = 20
    var piecesPlaced = 0

    while(piecesPlaced < puzzlePieces)
    {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")

    }

    // 5 cats
    var cats : List<String> = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")

    var i : Int = 0
    while (i < cats.size)
    {

        println("cat ${i+1} : ${cats.get(i)}")
        i++
    }

    // factorial
    var k = 1
    var result = 1

    println("Enter a num: ")
    val inputj = readLine()?:""
    val inputNum = inputj.toInt()

    while (k <= inputNum)
    {
        result *= k
        k++

    }

    println("${inputNum}! = $result")



}
package basics

fun main(args: Array<String>) {


    val list = generateSequence(0) {
        println("Calculating ${it + 10} time.")
        it + 10

    }

    val first10 = list.take(10).toList()
    val first20 = list.take(20).toList()

    println(first10)
    println(first10.size)
    println(first20)
    println(first20.size)

}
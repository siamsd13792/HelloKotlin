package basics

fun main(args: Array<String>) {
    val list: List<String> = listOf<String>("Hi", "There", "Kotlin", "fans")
    val containsT: List<Boolean> = listOf<Boolean>(false, true, true, false)

    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip( list.map { it.contains("t") } )

    println(zipped)
    println(mapping)
}
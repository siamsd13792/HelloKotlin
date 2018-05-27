package basics

fun main(args: Array<String>) {
    val list = listOf("Kotlin", "Java", "JavaStript")
    println(concat(list, " : "))
}

fun concat(texts: List<String>, separator: String = ", "): String{
    return texts.joinToString(separator)
}
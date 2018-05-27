package conditional

fun main(args: Array<String>) {

    val mode: Int = 1

    val result = when(mode){
        1 -> "The mode i s lazy"
        2 -> {
            println("the mode is 2")
            "hello"
        }
        3 -> {
            "The mode is super-productive."
        }
        else -> "I don't know that mode."
    }

    println(result)

    val x = if(mode < 2){
        17
    }else{
        42
    }

    println(x)


}
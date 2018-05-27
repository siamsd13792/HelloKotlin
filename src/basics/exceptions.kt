package basics

import java.io.IOException

fun main(args: Array<String>) {

    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        "Error"
    } finally {
        println("Finished process")
    }

    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read External Input")
}
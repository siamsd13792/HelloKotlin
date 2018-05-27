package io

import java.util.*

fun main(args: Array<String>) {
    val number = Random().nextInt(10) + 1
    var input: String?
    var guess = -1

    while (guess != number){
        print("Guess a number between 1 and 10: ")
        input = readLine()

        if (input != null){
            guess = input.toInt()
        }
        if (guess < number){
            println("Too low")
        }else if (guess > number){
            println("Too high")
        }else{
            println("You Won")
        }
    }
}
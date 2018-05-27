package oo

open class Stack<E>(vararg val item: E){

    val elements = item.toMutableList()

    fun push(element: E){
        elements.add(element)
    }

    fun pop(): E?{
        if (!isEmpty()){
            return  elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty():Boolean{
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg element: T): Stack<T>{
    return Stack(*element)
}

fun main(args: Array<String>) {
    val stack = Stack(1,2,3,4,5,6,7,8,9)
    val stack2 = stackOf("Hello", "Hi", "Hello")

    for (i in 1..3){
        println(stack2.pop())
    }



//    stack.push(11)
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
}
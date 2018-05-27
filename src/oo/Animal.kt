package oo

open class Animal {

    private var age: Int = 0
    protected var name: String = "Siam"
    internal val isDangerous = true

    private fun isOld(): Boolean {
        return age > 12
    }

    fun changeAge(num: Int){
        this.age = num
        println(this.age)
    }

}

class Monkey: Animal() {

    fun introduceYourSelf(){
        println(this.name)
    }

}

fun main(args: Array<String>) {

    val animal = Animal()
    val monkey = Monkey()

    //println(animal.isOld())
    animal.changeAge(20)
    //println(animal.isOld())
    //println(monkey.isOld())
    monkey.changeAge(20)
    //println(monkey.isOld())

}
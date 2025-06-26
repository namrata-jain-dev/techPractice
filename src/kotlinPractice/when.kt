package kotlinPractice

fun main() {
    val animal = "Dog"
    val result2 = when(animal){ // when is used as switch case
        "Horse" -> "Animal is Hourse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found"
    }
    println(result2)

    val number1 = 15

    val result3 = when(number1){
        11 -> "Eleven"
        12 ->"Twelve"
        in 13..19 -> "Teen"
        else -> "Not in range"
    }
    println(result3)
}
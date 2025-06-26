package kotlinPractice

fun main() {
    val number = 10
    var result = number in 1..5
    println(result)
    result = number in 1 until 15
    println(result)


}
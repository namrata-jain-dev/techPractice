package kotlinPractice

fun main() {
var result = addNumber(3,2)
    println(result)

    var result2 = addNumber(2,4)
    println(result2)
    evenOrOdd(12)
    evenOrOdd(13)

    printMessage(5) // argument is 5
    printMessage() // default argument 2
}


// todo syntax
// fun functionName(parameter1,param2...):ReturnType
//{
//    //Block of Statements
//      return result
//}

//fun addNumber(num1 :Int,num2:Int) : Int{
//    var sum = num1 + num2
//    return sum
//}
fun addNumber(num1 :Int,num2 : Int) = num1 + num2

fun evenOrOdd(num1: Int){ // by default return type Unit
    var result = if(num1 % 2 ==0) "Even" else "Odd"
    println(result)
}

fun printMessage(count:Int = 2){ // count parameter
//    count = 3 // gives error cause this is of val type and cant be reassigned
    for(i in 1..count){
        println("Hello $i")
    }
}
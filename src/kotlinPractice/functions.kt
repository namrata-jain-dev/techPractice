package kotlinPractice

fun main() {
var result = addNumber(3,2)
    println(result)
}


// todo syntax
// fun functionName(parameter1,param2...):ReturnType
//{
//    //Block of Statements
//      return result
//}

fun addNumber(num1 :Int,num2:Int) : Int{
    var sum = num1 + num2
    return sum
}
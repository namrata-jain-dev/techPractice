package kotlinPractice

import kotlin.math.pow

fun main(){

    println(addition(1,2))
    println(addition(a = 6,b = 5))
//    println(addition(1.5,2.6))

    var fn : (a: Double,b: Double) -> Double = :: addition // function assigned to a variable
//    var fn = :: addition // function assigned to a variable

    println(fn(14.4,2.5))

    fn = :: power // different functionality  with different inputs but the var is same

    println(fn(3.0,7.0))
}

fun addition(a:Int,b:Int):Int{
    return  a + b
}

fun addition(a: Double,b: Double): Double {
    return a + b
}

fun power(num1 : Double, num2: Double) : Double{
    return  num1.pow(num2)
}
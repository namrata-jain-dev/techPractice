package kotlinPractice

fun main() {
    val isRaining = false
    if(isRaining == true){
        println("Take Umbrella")
    }else{
        println("No Rains - Enjoy Your Day")
    }


    // no ternary operator in kotlin instead use this
    val number = 20
    val result = if(number % 2 == 0){
        "Even"
    }else{
       "Odd"
    }
    println(result)

}
package kotlinPractice

fun main() {
    var count = 5
    while (count >=1){
        println("Hello")
        count--
    }

    var number = 2
    var index = 10
    do {
        println("s")
        number--
    }while (number<1)


    // for loop
    for(i in number..index step 1){
        println(i)
    }
    for(i in number until index step 1){
        println(i)
    }

    for(i in index downTo number step 2){
        println(i)
    }


    var num = 2
    for (i in 2..10)
    {
//        println(number.toString() + " * " + i + " = "+(number*i))
        println("$num * $i = ${num*i}")
    }

}
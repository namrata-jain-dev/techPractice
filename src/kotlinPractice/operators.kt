package kotlinPractice

fun main(args:Array<String>){
    var i = 13
    var j = 2
    // arithmetic  operator
    println(i+j)
    println(i-j)
    println(i*j)
    println(i.toFloat()/j)


    // modulus operator
    println(i%j)

    // relational operator > , <,>=,<=,==, !=
    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i==j)
    println(i!=j)


    // increment operator
    i++ // post increment pahle value ko use karta he or baad me memory me jakar use karta he
    println(i)
    i--
    println(i)
    ++i // pre increment pahle plus karega baad me use karega
    println(i)
    --i
    println(i)


    // logical operators

    var above70 = true
    val knowsProgramming = false

    // && And
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)


    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    // ! operator


}
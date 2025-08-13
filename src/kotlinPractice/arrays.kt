package kotlinPractice

fun main() {

    var arr = arrayOf(1,2,3,4,5)
    for (i in arr ){
        println(i)
    }
    for ((index,element) in arr.withIndex() ){
        println("$index - $element")
    }
    println(arr[0])
    println(arr.get(3))

    arr.set(0,23)

//    arr.size
}

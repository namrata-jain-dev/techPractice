package kotlinPractice

fun main() {
    val mustang = Car("mustang","petrol",100)
    val beetle = Car("beetle","disel",200)

    println(mustang.name)
    println(beetle.name)
    println(mustang.type)
    println(beetle.type)

    mustang.driveCar()
    mustang.applyBreaks()
}
class Car(val name : String, val type : String, var kmRan : Int) { // properties
    // property decalration is same as variable declaration
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBreaks(){
        println("$name Applied Breaks")
    }
}


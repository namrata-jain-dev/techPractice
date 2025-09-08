package kotlinPractice

fun main() {

    // if in the constructor var or val is given then its a property
    // else it is a parameter
    var car = AutoMobile("Car",3,6,true)
//    car.hasairbag is not present i it is given without var or val

    car.airBags
    var person = Person2("A",20)

    println(person.age)
    println(person.name) // will give error if name is a val

    var car2 = AutoMobile("Car2",4,5,true)
}
// primary constructor
class AutoMobile(val name : String,val tyres:Int, val maxSeating : Int,hasAirBags: Boolean) {

    init {
        println("$name is created")
    }
    var airBags = hasAirBags

    init {
       println("2nd Initializer Block")
    }

    fun drive(){}

    fun applyBreak(){}


    // secondary constructor which will call primary constructor vby default
    constructor(name: String,hasAirBags: Boolean):
            this(name,4,5,hasAirBags)
}
class Empty{}

class  Person2(nameParam:  String, ageParam : Int ){
    var name : String = nameParam
    var age:Int = ageParam
    var canVote : Boolean = age>18
}
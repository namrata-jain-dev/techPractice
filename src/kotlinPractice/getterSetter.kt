package kotlinPractice

fun main() {
    // default constructor
    var ob = getterSetter()
    println(ob.add(3,2))

    var p1 = Person3("iuytfdfA",21)
    println(p1.age)

    p1.age = -22

    println(p1.name)
}
class getterSetter {

    lateinit var message : String

    fun add (a:Int,b:Int):Int{
        return a+b
    }
}
class  Person3(nameParam:  String, ageParam : Int ){
    var name : String = nameParam
        get() {
            println("come in get")
            return field.toUpperCase()
        }
    var age:Int = ageParam
        set(value){
            if (value>0){
                field = value
            }else{
                println("Age can't be neagtive")
            }
        }
        get(){
            return field.dec()
        }
}

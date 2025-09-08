package kotlinPractice

// pahle parent ka constructor call hoga fir child ka
// explicitely used to tell for inheritance
// multiple classes se inherit nhi kar sakte ek time par ek hi class se inherit kar sakte he
fun main() {
    var objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
    var parent = Parent()
    parent.myMethod()

    var son : Child = Child() // reference of child and object is also of child
    var son2 : Parent = Child() // polymorphism // parent ka reference but child ka object storing

}
open class Parent {
    val name : String = ""
    fun myMethod(){
        println("I am in Parent")
    }
}

class Child : Parent(){
    val name2 : String = ""

    fun myMethod2(){
        println("I am in Child")
    }
}
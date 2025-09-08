package kotlinPractice

fun main(){
    var i : Int = 20
    println(i.plus((12)))
    println(i.toFloat())

    val p1 = Person("A",12)
    val p2 = Person("B",21)

    println(p1.canVote())
    println(p2.canVote())

    p1.age = 22
    println(p1.canVote())
}
class Person ( name : String,var age : Int) {
    fun canVote(): Boolean{
        return age > 18
    }

}
package kotlinPractice

// in kotlin each class has a super Class which is Any
fun main() {
    var samsung = SmartPhone("Smart Phone")
    samsung.makeCall()
    var mobile = Phone("General")
    mobile.makeCall()
    println(samsung.toString())
}
// open keyword is used to inherit a class
open class Phone (var type : String){
    open val name : String = ""
    val size : String = ""
    val volume : Int = 10

    init {
        println(type)
    }
    // to allow for override use open keyword
    open fun makeCall(){
        println("phone Call feature is changed")
    }
    fun display(){}
    fun powerOff(){}
    fun getDeviceInfo(){}
}
class BasicPhone(typeParam:String) : Phone(typeParam) {
    fun getScreenInfo(){}
}

class SmartPhone(typeParam:String) : Phone(typeParam){

    override var name = "Samsung"
    override fun makeCall() {
        super.makeCall()
        println("Phone call setting is not changed in samsung")
    }
    fun playMovie(){}
    fun takePicture(){}
    fun getLocation(){}


    override fun toString(): String {
        return "$name is smart phone"
    }

}
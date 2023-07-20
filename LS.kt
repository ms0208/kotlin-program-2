fun main() {
    var names = listOf("Manav","Mani","Manika")
    for(name in names){
        println(name)
    }
    var numbers = setOf(1,2,3,4,5,6,7,8,9,10) 
    for(number in numbers){
        println(number)
    }
    println("Maximum number is ${numbers.max()} and Minimum number is  ${numbers.min()}")
    
    var cars = setOf<String>("Audi", "BMW", "honda")
    for(car in cars){
        println(car) 
    
    }
    var Nos = mapOf( 11 to 20)
    for(No in Nos){
        println(Nos)
    }
}
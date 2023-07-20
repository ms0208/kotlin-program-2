import java.util.Scanner 
fun main() { 
    var x = Scanner(System.`in`) 
    println("Enter the age: ")
    var age:Int = x.nextInt()
    println("Your age is $age") 
    if(age>=18) {
        println("Elgible to vote")
    }else {
        println("Not eligible to vote")
    }

    

}
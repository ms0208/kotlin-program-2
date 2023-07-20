import java.util.Scanner
fun main() {
    
    println("Enter your name: ")
    
    val name = readLine()!!

    println("Your name is $name")

    val reader = Scanner(System.`in`) 

    println("Enter a ID: ")

    val Id:Int = reader.nextInt()

    println("Your ID is $Id") 

}
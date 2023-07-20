import java.util.Scanner 
fun main() {
    var x = Scanner(System.`in`)

    println("Enter the value of a: ")
    var a:Int = x.nextInt() 
    println("value of a $a")

    var y = Scanner(System.`in`)
    println("Enter value of b: ")
    var b:Int = y.nextInt() 
    println("value of b $b")
    var c:Int 
    c=a
    a=b
    b=c  
    println("After Swapping")
    println("Value of a $a")
    println("Value of b $b")
}
fun main() {



    val PLUS = operate(10,5, { a, b -> a+b}) 
    val MINUS = operate(20,10, {a,b -> a-b})
    val MULTI = operate(5,10, {a,b -> a*b})
    val DIV = operate(10,2,{a,b -> a/b})
    

    println(PLUS)
    println(MINUS)
    println(MULTI)
    println(DIV)


}
fun operate (a:Int, b:Int , add:(Int,Int)-> Int) : Int
{
    return add(a,b) 

}
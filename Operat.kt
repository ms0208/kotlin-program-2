fun main() {
   println(add(10,20))
   println(multi(5,10))   //  Funtion call 
   println(subst(20,13))
   println(Div(9,6))

}
fun add (a:Int , b:Int) : Int {  // Funtion Define
    return a+b
}
fun multi (a:Int , b:Int) : Int {
    return a*b
}
fun subst(a:Int ,  b:Int) : Int {
    return a-b
}
fun Div(a:Int , b:Int) : Int {
    return a/b
}
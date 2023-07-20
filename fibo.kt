fun main() {
    var x = 0
    var y = 1
    var z = x+y
    var i = 3
    println(x)
    println(y)
    println(z)
    while(i<=10) {
        x = y
        y = z
        z = x+y 
        println(z)
        i++

    }
}
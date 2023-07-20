fun main() {
    var x = 5 
    for(i in 1..x){
        for(j in 1..i){
        print("*")
    }
    println()
}

println("Next pattern")

for(i in 1..x) {
    for(j in 1..x) {
        print("*")
    }
    println()
}

println("Next pattern") 
for(i in x downTo 1) {
    for(j in 1..i) {
        print("*")
    }
    println()
}

    
}
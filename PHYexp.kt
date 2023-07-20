import java.util.Scanner 

fun main() {
    var EXP = Scanner(System.`in`) 
    println("Enter the Experiment")
    var experiment = EXP.nextInt()  
    when(experiment) {
        1 -> {
            println("Capacitor experiment")
        }
        2 -> {
            
            println("Sonometer experiment")
        }
        3 -> {
            println("Melde's experiment")
        }
        4 -> {
            println("Energy band gap")
        }
        5 -> {
            println("Stefan's law")
        }
        6 -> {
            println("Hall effect")
        }
        7 -> {
            println("Zener diode")
        }
        8 -> {
            println("Lee's method")
        }
        else -> {
            println("No experiment")
        }
        
        
    }
}
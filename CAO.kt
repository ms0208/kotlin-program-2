fun main () {
    val s1 = student("Manav",8, 90)
    println("Student name is")
    println(s1.name)
    println("Student roll no is")
    println(s1.roll)
    println("Student marks is")
    println(s1.marks)

    val E1 = Employee("Pranav",6,2500)
    println("Employee name is")
    println(E1.name)
    println("Employee ID is")
    println(E1.ID)
    println("Employee salary is")
    println(E1.Salary)




}
class student (val name:String , val roll:Int , val marks:Int) {

}
class Employee (val name:String , val ID:Int , val Salary:Int){

}
    
    

import kotlin.jvm.internal.AdaptedFunctionReference

fun main(){
  /*  t 1: Variables and Data Types
    You are creating an app to capture student records. Some of the data you will
            capture includes full name, age, phone number,  weight in kg and citizen. For the
    citizen field you will track whether a student is a Kenyan or not.
    Create variables and assign them some values for each of these fields.
    This assignment will be graded out of 10 points. Submit a github link*/
   var x= takeName("Ada")
    println(x)
    var remeinder= takeDiv(8,3)
    println(remeinder)
    var add= takeadd(4,5,4,2)
    println(add)
    var satement= fact("chirii","dancing")
    println(satement)
    takeStrings(arrayOf("chirii","kemboi","mercy"))
    takecities(arrayOf<String>())
    takenumbers(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
  var me=  takeStrn(arrayOf("Chirii","Mercy","conslate"))
    println(me.contentToString())

    getChar()

   var m= takeReminder(8,3)
    println(m)

   println( isEven(3))

    var pen=product("Bic",10.5,30,"other")
    var towel= product("victoria secret",18.1,300,"hygine")
    var vegetables= product("cabbage", 25.5,60,"groceries")
    var items= listOf(pen,towel,vegetables)
    println(items)

   println( takeMe("Nancy",33))
    println( takeLength("Grocery"))

    var mmercy=Human("mercy",44,50)
    println(mmercy.weight)
    (mmercy.eat(3))
    println(mmercy.weight)
    mmercy.speeak("toit")
    mmercy.birthday()




}
fun  studentRecord(name:String,age: Int, phonenumber:String,weight:String){
   /* Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
    given “Ada” it will print out “Hello Ada” (2 points)
    Create and invoke a function that given 2 numbers returns the remainder of their
    division (3 points)
    Create and invoke function that returns the sum of any given 4 numbers (3 points)
    Create and invoke a function that prints out an interesting fact about yourself (2
            points)
    Submit a github link.
*/
}
fun takeName(name:String):String{
    var me = "Hello $name"
       return me

}
fun takeDiv(number1:Int,number2: Int):Int{
    var division= number1%number2
    return division
}
fun takeadd(n1:Int,n2:Int,n3:Int,n4:Int):Int {
    var sum = n1 + n2 + n3 + n4
    return sum
}
fun fact(name:String,Fact: String):String{
    var mimi= ("I am $name and I love $Fact")
    return mimi
}

/*1. Create a function that takes in 4 strings  and creates an array out of them
then prints out the array                (2 points)

2. Create a function that given an array below:
var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case.      (2 points)

3. Create one function that given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements                         (1 point)
(ii) prints out the index of 158                                                                                (1 point)
(iii) prints out the elements in ascending order */                                       //   (2 points)

//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun takeStrings(name:Array<String>){
    println(name.contentToString())

}
fun takecities(cities:Array<String>){
    var cities = arrayOf("harare","mumbai","dodoma","jakatta")
     cities.forEach { n ->
         println( n.capitalize())
     }
}
fun takenumbers(num:Array<Int>){
    var sum = (num[1]+num[4])
    println(sum)
    var summ= num[1].plus(num[4])
    println(sum)

    var indicies= num.indexOf(158)
    println(indicies)

    var arrange= num.sortedArray()
    println(arrange.contentToString())

}
fun takeStrn(namess:Array<String>):Array<String>{
    return namess

}
/*1

1. Given a string “codeHive”. Write a function that prints out a string composed
of the fifth, sixth, seventh and eighth  characters of the string (2 points)
2. Create and invoke a function that given two numbers returns the
remainder of their division (3 points)
3. Write a function that takes in two parameters, name and age and returns a
String with this structure “Hi, my name is p and I am z years old.” Where p
and  z are your  name and age respectively. (3 points)
. Write a function that takes in a string and returns its length(2 points)*/
fun getChar(){
    var school= "codeHive"
    var char5= school[4]
    var char6 = school[5]
    var char7 = school[6]
    var char8 = school[7]

    var characters =char5.toString()+char6+char7+char8
    println(characters)

}
fun takeReminder(number:Int, number2:Int):Int{
    var modulus= number%number2
    return modulus



}
//create a function called isEven() that returns true when the number passed to it is
  //      even or returns false when the number passed is odd
fun isEven(num:Int):Boolean{
    return(num%2==0)
}
data class product (var name: String, var weight:Double,var price:Int,var category:String)
fun takeProduct(name:product){
    var prd= mutableListOf<product>()
    when(name.category){
        "other"-> println()
    }
}
fun takeMe(name:String,age: Int):String{
    var chirii="Hi my name is $name and I am $age years Old"
    return chirii
}
fun takeLength(category:String):Int{
    return category.length





}
/*1. Create a class called Human with these attributes: name, age, weight. It has
the following functions:
- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
and increments the human’s weight by the weight of the food eaten
(3 points)
-
- speak(speech: String) :Prints the string passed to it
(2
points)
-
birthday( ) :Increments the human’s age by 1
points)
Create an instance of this human class and invoke all its functions
(2
2. Create a data class User with these fields: firstName, lastName, email,
phoneNumber, password. Create an instance of User and print out any 2
attributes
(3 points)*/
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        weight+=foodweight
        println("I am eating $foodweight kgs of food")
    }
    fun speeak(Speech:String){
        println(Speech)
    }
    fun birthday(){
      age+=1
      println(age)
    }

}


data class user(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)

 fun reading(){

 }
/*
Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
- carry(people: Int) : Prints out “Carrying $people passengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity
(3 points)
- identity() : Prints out the color, make and model in the following
format e.g: “I am a white subaru legacy”
(1 point)
- calculateParkingFees(hours: Int) : Calculates and returns the
parking fees by multiplying the hours by 20 (1 point)
2. Create a class Bus with the same attributes and functions as the Car class.
In addition, it has another method called maxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip.
(2 points)
The bus’ calculateParkingFees method returns the product of hours and
the capacity of the bus
(3 points)
Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
and call each of the functions on the objects.*/
class car(var make:String,)
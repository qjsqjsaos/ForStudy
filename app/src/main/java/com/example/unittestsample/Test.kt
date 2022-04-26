package com.example.unittestsample

fun main() {
//    var courseName :String = "Android Masterclass"
//    val leet : Float = 13.37F
//    val pi : Double = 3.14159265358979
//    var age : Byte = 25
//    var year : Short = 2020
//    var phoneNumber: Long = 18881234567
//    var isGood : Boolean = true
//    var firstCharacter : Char = 'a'

    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length
//    print("First character $firstCharInStr and the length of myStr is ${myStr.length}")

    //Arirthmetic operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 1.0
    val n = 2.0
    val reusltDouble: Double = a / n
//    print(reusltDouble)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
//    println("isEqual is $isEqual")


    val isNotEqual = 5 != 5
    //String interpolation
//    println("isNotEqual is $isNotEqual")
//
//    println("is-5greater3 ${-5 > 3}")
//    println("is5LowerEqual3 ${5 <= 3}")
//    println("is5GreaterEqual3 ${5 >= 3}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
//    myNum = myNum + 3
    myNum += 3
    myNum *= 4
//    println("myNum is $myNum")

    //Increment =& Decrement operators (++, --)
    myNum++
//    println("myNum is $myNum")
//    println("myNum is ${myNum++}")
//    println("myNum is ${++myNum}")
//    println("myNum is ${--myNum}")


//    var heightPerson1 = 170
//    var heightPerson2 = 159
//
//    if(heightPerson1 > heightPerson2) {
//        println("use raw force")
//    } else if (heightPerson1 == heightPerson2) {
//        println("use your power technique 1337")
//    } else {
//        println("use technique")
//    }
//
//    val age = 31
//
//    if(age >= 30)
//        println("you're over 30")
//
//
//
//    if (age >= 21) {
//        println("now you may drink in the US")
//    } else if(age >= 18) {
//        println("you may vote now")
//    } else if(age >= 16) {
//        println("you may drive now")
//    } else {
//        println("you're too young")
//    }

//    var name = "Denis"
//    if(name == "Denis") {
//        println("welcome home denis")
//    }
//    else {
//        println("Who are you?")
//    }
//
//    var isRainy = true
//    if(isRainy)
//        println("It's Rainy")

    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
    }
}
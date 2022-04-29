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
//    var age = 21
//    when(age) {
//        !in 0..20 -> println("now you may drink in the US")
//        in 18..20 -> println("you may vote now")
//        16, 17 -> println("you may drive now")
//        else -> println("you're too young")
//    }

//    var x : Any = "13.37f"
//    when(x) {
//        is Int -> println("$x is an Int")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
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

//    var season = 3
//    when(season) {
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid Season")
//    }
//
//    var month = 3
//    when(month) {
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        in 12 downTo 2 -> println("Winter")
//    }


    //While loop
//    var x = 100
//    while(x >= 0) {
//        print("$x")
//        x -= 2
//    }
//    println("\n while loop is done")
//
//    x = 15
//    do {
//        print("$x")
//        x++
//    }while (x <= 10)
//    println("\n do while loop is done")
//
//    var feltTemp = "cold"
//    var roomTemp = 10
//    while (feltTemp == "cold") {
//        roomTemp++
//        if(roomTemp >= 20) {
//            feltTemp = "comfy"
//            println("it's comfy now")
//        }
//    }

//    for(num in 1..10) {
//        print("$num")
//    }
//
//    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
//        print("$i ")
//    }
//    println("-----------------------")
//    for(i in 10 downTo 1 step 2) { // Same as - for(i in 10.downTo(1).step(2))
//        print("$i ")
//    }

    var z = 12
    do {
        print("$z ")
    } while(z <= 10)

}
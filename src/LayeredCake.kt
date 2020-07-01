/*
Created by ikayz on 29/06/2020
*/
fun main() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(age + 2) {
        print("@")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()

    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

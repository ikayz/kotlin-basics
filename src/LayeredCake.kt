/*
Created by ikayz on 29/06/2020
*/
fun main() {
    val age = 24
    val layers = 6
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

// Function prints bottom cake layers
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

// Function prints Cake top
fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

// Function prints Cake candles
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

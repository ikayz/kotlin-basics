/*
Created by ikayz on 29/06/2020
*/
fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday Isaac!")
    printBorder(border)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}
/*
Created by ikayz on 02/07/2020
*/

// Function without an argument
fun generateAnswerString(): String {
    val count = 42
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }

    return answerString
}

// Function which takes an argument
fun generateAnswerString(countThreshold: Int): String {
    val count = 42
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }

    return answerString
}

fun main() {
    val answerString = generateAnswerString(42)
    println(answerString)
}
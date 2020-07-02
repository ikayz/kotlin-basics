/*
Created by ikayz on 02/07/2020
*/
fun generateAnswerString(): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }

    return answerString
}

fun main() {
    val answerString = generateAnswerString()
}
/*
Created by ikayz on 01/07/2020
*/
fun main() {
    val count = 32
    if(count == 23) {
        println("That's the answer")
    } else if (count == 32){
        println("That's not quite the answer")
    } else {
        println("That's not the answer")
    }

    // Conditional expression
    val answerString: String = if (count == 42) {
        "That's the answer."
    } else if (count == 32) {
        "The answer is not quite right."
    } else {
        "You got it wrong"
    }
    println(answerString)
}
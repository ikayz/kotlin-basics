import java.util.*

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

    // When expression
    val answerStringTwo = when {
        count == 23 -> "I have the answer."
        count > 23 -> "It's not quite right."
        else -> "That's not right."
    }

    // Nullable
    val languageName: String? = null
    if (languageName != null) {
        println(languageName.toUpperCase())
    }

    println(answerStringTwo)

    val scanner = Scanner(System.`in`)
    val cutFraction: Double = scanner.nextInt().toDouble()
    println(cutFraction)
}
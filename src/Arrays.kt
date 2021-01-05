/*
Created by IntelliJ IDEA. User: ikayz Date: 05/01/2021 
Day: Tuesday Time: 12:20 pm
*/
fun main() {
    val books =  arrayOf("Howl's moving castle", "The Hobbit", "Lord of the Rings", "Spirited away")

    books[2] = "Peter pan"
    println("Book number two is: ${books[1]}" )

    val clothes = arrayOf(
        arrayOf("Jackets", "Coats", "Jumpers"),
        arrayOf("Denim Jeans", "Soft Jeans", "Ripped Jeans")
    )

    println("I love ${clothes[0][0].toLowerCase()} and ${clothes[1][1].toLowerCase()}")
}
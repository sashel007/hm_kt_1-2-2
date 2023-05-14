import java.util.*

fun main(args: Array<String>) {
    val like: Int
    val manCase = "человеку"
    val peopleCase = "людям"


    println("Введите количество лайков: ")
    var likes = readln().toInt()

    var likesWord = when {
        likes % 10 == 1 && likes % 100 != 11 -> print("Понравилось $likes $manCase.")
        likes % 10 in 2..4 && likes % 100 !in 12..14 -> print("Понравилось $likes $peopleCase")
        else -> println("Понравилось $likes $peopleCase")
    }
}
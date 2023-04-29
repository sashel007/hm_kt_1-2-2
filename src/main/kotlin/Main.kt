import java.util.*

fun main(args: Array<String>) {
    val like: Int

    val scanner = Scanner(System.`in`)
    println("Введите количество лайков: ")
    val likes = scanner.nextInt()

    val peopleWord = if (likes == 1) "человеку" else "людям"

    var likesWord = when {
        likes % 10 == 1 && likes % 100 != 11 -> print("Понравилось $likes $peopleWord")
        likes % 10 in 2..4 && likes % 100 !in 12..14 -> print("Понравилось $likes $peopleWord")
        else -> println("Понравилось $likes людям")
    }
}
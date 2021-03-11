package curso

import curso.fundamentals.Color

fun getDescription(color: Color) =
    //switch do java
    when(color) {
        Color.RED -> "Vermelho"
        Color.YELLOW -> "Amarelo"
        Color.GREEN -> "Verde"
        Color.BLUE -> "Azul"
        Color.ORANGE -> "Laranja"
    }

fun getTemperature(color: Color): String {
    return when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Hot"
        Color.GREEN -> "Neutral"
        Color.BLUE -> "Cold"
    }
}


fun getNameDay(numberDay: Int) = when(numberDay) {
    1 -> "Sunday"
    2 -> "Monday"
    3 -> "Tuesday"
    4 -> "Wednesday"
    5 -> "Thursday"
    6 -> "Friday"
    7 -> "Saturday"
    else -> "unknown day"
}

fun main() {
    println(getDescription(Color.RED))
    println(getTemperature(Color.YELLOW))
    println(getNameDay(3))
    println(getNameDay(9))

    val chair = 2

    when(chair) {
        in 1..10 -> println("Row A")
        in 11..20 -> println("Row B")
        in 21..30 -> println("Row C")
        in 31..40 -> println("Row D")
    }

}

fun isEvenNumber(number: Int) = number % 2 == 0
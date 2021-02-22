package cursoyoutube

fun main() {
    println(isLetter('a'))
    println(isLetter('9'))
    println(isNotDigit('5'))
    println(isNotDigit('f'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'
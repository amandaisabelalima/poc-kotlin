package curso.others

import java.lang.IllegalArgumentException

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num-1)
    else -> throw IllegalArgumentException("numero negativo")
}

fun main() {
    println("Calculo de fatorial:")
    println("Resultado = ${fatorial(5)}")
}
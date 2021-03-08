package curso

import curso.packageA.simplesFuncao as funcaoSimples
import curso.packageA.Coisa
import curso.packageA.FaceMoeda.CARA
import curso.packageB.*

fun main() {
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println(soma(2, 3))

    println(subtracao(5, 1))
}
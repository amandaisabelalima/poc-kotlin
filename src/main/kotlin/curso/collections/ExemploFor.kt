package curso.collections


data class Pessoa(val nome: String, val idade: Int)

fun main() {
    val alunos = arrayListOf("amanda", "andre", "bernardo", "carlos")

    for(aluno in alunos) {
        println(aluno)
    }

    //forma de pegar o indice
    for((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }

    val pessoas = listOf(
            Pessoa("amanda", 26),
            Pessoa("sandra", 49)
    )

    pessoas.forEach {
        println(it.nome)
    }
}
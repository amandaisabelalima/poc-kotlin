package curso.lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = listOf(
            Aluno("joao", 7.4),
            Aluno("arthur", 8.0),
            Aluno("rafael", 9.7),
            Aluno("ricardo", 5.7))

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    println(aprovados)


}
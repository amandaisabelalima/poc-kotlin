package curso.fundamentals

class Filme(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("Guerra dos Mundos", 2010, "ação")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}.")
}
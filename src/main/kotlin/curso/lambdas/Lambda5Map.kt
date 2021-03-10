package curso.lambdas

fun main() {
    //transforma uma lista em outra a partir de algum critério

    val nomes = listOf("Renata", "Fernando", "Andreia", "Willian", "Beatriz")
    nomes.map { it.toUpperCase() }.apply { println(this) }

    println(nomes)


}
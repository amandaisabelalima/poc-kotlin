package curso.lambdas

fun main() {
    val nomes = listOf("Renata", "Fernanda", "Andreia", "Willian", "Beatriz")

    println(nomes.sortedBy { it })
    println(nomes.sortedBy { it.reversed() }) //inverte o nome e ordena
    println(nomes.sortedByDescending { it })

    val numeros = listOf(3, 1, 7, 4, 9, 0)
    println(numeros.filter { i -> i > 5 })

}
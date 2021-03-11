package curso.collections

fun main() {
    val nomes = arrayListOf("amanda", "maria", "joao", "jose")

    for (nome in nomes) {
        println(nome.toUpperCase())
    }

    val pares = intArrayOf(2, 4, 6)
    val impares = arrayListOf(1, 3, 5)
    val todos = pares.union(impares).sorted()

    for(num in todos) {
        println(num)
    }
}
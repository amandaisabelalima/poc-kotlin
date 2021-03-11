package curso.collections

fun main() {
    val numeros = arrayListOf(1, 2, 3, 4)
    val chars = arrayListOf('a', 'b', 'c', 'd')

    val uniao = numeros + chars //sobrecarga de operadores

    for (item in uniao) {
        println(item)
    }
}
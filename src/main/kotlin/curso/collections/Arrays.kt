package curso.collections

fun main() {
    val numeros = Array<Int>(10) { i -> i * 10 }
    println(numeros)

    for (num in numeros) {
        println(num)
    }
    println("-------------------")

    println("indice 2 = ${numeros.get(2)}")
    println("indice 3 = ${numeros[3]}")

    numeros[3] = 222

    for (num in numeros) {
        println(num)
    }
    val teste = Array<Int>(10) { 0 }
    teste[1] = 5

}
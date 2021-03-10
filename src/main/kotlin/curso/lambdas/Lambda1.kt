package curso.lambdas

fun main() {
    val soma = { x: Int, y: Int ->
        x + y
        1 + 3
        "texto"//executa sempre a ultima linha
    }

    println(soma(2, 3))
}
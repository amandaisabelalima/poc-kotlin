package curso.lambdas

class Produto(val nome: String, val preco: Double)

fun main() {
    val produtos = listOf(
            Produto("notebook", 3500.0),
            Produto("power bank", 85.00),
            Produto("celular", 2500.0)
    )

    val valorTotal = produtos.map { it.preco }.reduce {
        total: Double, atual: Double -> total + atual
    }

    println(valorTotal)
    println("media de preço da lista = ${valorTotal / produtos.size}")

}
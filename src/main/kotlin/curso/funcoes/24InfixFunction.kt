package curso.funcoes

class Product(val name: String, val price: Double)

//adiciona um método em uma classe para usar ENTRE operandos
infix fun Product.moreExpensiveThat(product: Product): Boolean = this.price > product.price

fun main() {
    val p1 = Product("notebook", 4500.0)
    val p2 = Product("celular", 2800.9)

    println(p1 moreExpensiveThat p2)

    println(p2.moreExpensiveThat(p1))
}
package curso.lambdas

class CalculadoraDois {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor1: Int) {
        resultado += valor1
    }
}
fun main() {
    val calc = CalculadoraDois()

    //o apply sempre retorna o elemento com o qual ele está trabalhando, no caso aqui, Calculadora()
    calc.apply { soma(1, 2) }.apply { add(2) }.apply { println(resultado) }

    calc.apply {
        soma(1, 2)
        add(2)
        println(resultado)
    }

    //inline function
    with(calc) {
        soma(1, 2)
        add(2)
        println(resultado)
    }
}
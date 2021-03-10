package curso.lambdas

/*
calculadora comm dois métodos:
1 - somando dois elementos
2 - que recebe uma operação e os dois elementos, e ela executa a operação
 */

interface Operacao {
    fun executar(a: Int, b: Int) : Int
}

class Multiplicacao : Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int) : Int {
        return a + b
    }

    //sem lambda:
    fun calcular(a: Int, b: Int, operacao: Operacao) : Int {
        return operacao.executar(a, b)
    }

    //com lambda: nao precisa da interface e implementacao da interface
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int) : Int {
        return operacao(a, b)
    }
}

fun main() {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcular(2, 3)
    val resultado2 = calculadora.calcular(2, 3, Multiplicacao())
    println("$resultado1 - $resultado2")

    val subtracao = {a: Int, b: Int -> a - b}
    val resultado3 = calculadora.calcular(5, 3, subtracao)
    println(resultado3)

}





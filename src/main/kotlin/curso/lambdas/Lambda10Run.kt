package curso.lambdas

data class Casa(var endereco: String = "", var numero: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "rua blablabla"
        numero = 25
    }

    println(casa)

    //o run nao retorna o próprio objeto como o apply faz
    casa.apply {
            endereco = "rua"
            numero = 25
        }
        .endereco.toUpperCase()
        .let { println(it) }
    println(casa)
}
package cursoyoutube

fun main() {
    val n1 = 2
    val n2 = 5

    var resultado = if(n1 > n2)
        n1
    else
        n2

    var test = if(n1 > n2) n1 else n2

    println(resultado)

    /*
    Em Kotlin não existe if ternário, mas a o if pode ser utilizado
     como expressão retornando um valor ao ser avaliado.
     */
}
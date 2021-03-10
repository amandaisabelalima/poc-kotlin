package curso.lambdas

fun main() {
    println("digite algo..")
    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "mensagem default"

    val mensagem2 = if (entrada?.trim() != "") entrada else "mensagem padrao"
    val mensagem3 = entrada?.trim() ?: "sem mensagem" //assim qdo nao passa nada ou passa espaço vazio, não cai na msg padrao

    println(mensagem)
    println(mensagem2)
    println(mensagem3)
}
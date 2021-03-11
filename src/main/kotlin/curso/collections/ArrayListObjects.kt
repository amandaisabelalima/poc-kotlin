package curso.collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(
            Fruta("banana", 1.50),
            Fruta("morango", 2.30),
            Fruta("laranja", 1.90),
            Fruta("mamao", 1.90),
            Fruta("mamao", 3.90)
    )

    for(fruta in frutas) {
        println(" ${fruta.nome} - ${fruta.preco}")
    }

    if(frutas.contains(Fruta("morango", 2.3)))
        println("contem")
    else
        println("nao contem")

    val subList = frutas.subList(1, 3)
    for (item in subList) {
        println(item)
    }

    println(frutas.distinctBy { it.preco })

    println("+++")
    println(frutas.distinctBy { it.nome })
}
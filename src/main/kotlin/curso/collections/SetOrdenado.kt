package curso.collections

fun main() {
    val aprovados = hashSetOf("joao", "maria", "eduarda", "ana", "miguel")
    //aprovados.add(1) //nao funciona pq o set foi criada contendo apenas Strings

    println("sem ordem...")
    println(aprovados)

    println("\nordem de inclusão..")
    val aprovadosOrdem1 = linkedSetOf("joao", "maria", "eduarda", "ana", "miguel")
    println(aprovadosOrdem1)

    println("\nordem alfabética..")
    val aprovadosOrdem2 = sortedSetOf("joao", "maria", "eduarda", "ana", "miguel")
    println(aprovadosOrdem2)

    println("\nordem personalizada..")
    val aprovadosOrdem3 = aprovados.sortedBy { it.substring(1) }
    println(aprovadosOrdem3)
}
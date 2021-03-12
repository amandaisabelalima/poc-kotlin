package curso.others

import curso.collections.Objeto

class Caixa<T>(val objeto: T) {
    private val objetosList = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T) {
        objetosList.add(novoObjeto)
    }

    override fun toString(): String {
        return objetosList.toString()
    }
}

fun main() {
    val materiais = Caixa<String>("Tesoura")
    materiais.adicionar("Papel")
    materiais.adicionar("Caneta")

    println(materiais)
}
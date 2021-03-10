package curso.functions

class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somarDois(a: Int, b: Int): Int {
    return a + b
}

//recebo a função e invoco ela dentro de calc()
fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main() {
    println(calc(2, 3, Operacoes()::somar))
    println(calc(1, 1, ::somarDois))

    val nomes = listOf("ana", "amanda", "bia", "catarina")
    println(filtrar(nomes, ::comTresLetras))

    /*
    criei uma lista, ai chamei um método de filtro que crio
    esse metodo recebe uma lista e uma condição para o filtro, que no caso é uma função
    entao a função que valida se vai filtrar ou nao é criada separada, e passada como parametro para o filtro
     */
}


fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean) : List<E> {
    val listaFiltrada = ArrayList<E>()
    for(e in lista) {
        if(filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String) : Boolean{
    return nome.length == 3
}
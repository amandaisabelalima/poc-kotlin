package curso.collections

import java.util.concurrent.CopyOnWriteArraySet

//adiciono um comportamento em uma classe que já existe
//Any é a super classe dos tipos básicos(Int, String, Boolean, etc)
fun Any.print() = println(this)


fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14) //set nao ordena os elementos na ordem que foi incluido
    //conjunto.get(1) //ERRO: Set não é indexado!!

    conjunto.add(3).print() //vai dar false pq o set não aceita valor duplicado

    conjunto.add(4).print()
    conjunto.size.print()
    conjunto.remove('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) //somente leitura, não tem como add elemento novo
    //nums.add(4) //nao dá

    (conjunto + nums).print() //nao vai add o 3 de novo pq ja tem em 'conjuntos'
    (conjunto - nums).print()
    conjunto.intersect(nums).print() //não muda a val conjunto, cria um novo
    conjunto.retainAll(nums).print() //esse altera a val conjunto.. não é recomendado
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()

}
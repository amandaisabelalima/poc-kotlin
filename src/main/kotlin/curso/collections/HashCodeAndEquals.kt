package curso.collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Objeto) {
            nome.equals(other.nome, ignoreCase = true) //ignora letras maiusculas/minusculas
        } else {
            false
        }
    }
}

fun main() {
    val objetos = hashSetOf(
            Objeto("Cadeira", "..."), //hashcode = 7
            Objeto("Mesa", "..."), //hashcode = 4
            Objeto("Faca", "..."), //hashcode = 4
            Objeto("Copo", "...") //hashcode = 4
    )

    println(objetos.contains(Objeto("faca", "aaaaaaa")))

    /*
    o que foi feito na comparação acima:
    buscou na lista todos os objetos com hashcode = 4 (pq o parametro da comparacao tem 4)
    dentre os que ele filtrou, usou o equals para comparar

    entãp, quanto mais único for o hashcode, mais rápido encontra o elemento, pq o filtro
    é mais específico

    hashcode é muito mais rápido que o equals
    isso pq o hashcode faz uma pesquisa superficial para gerar um subconjunto dos elementos
    e depois o equals vem comparando de fato

    quando usa "data class", por padrão todos os atributos da classe são usados para deinir a igualdade
    do objeto desse tipo
     */
}
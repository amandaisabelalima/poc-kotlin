package curso.fundamentals

class Cliente {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf {value.isNotEmpty()} ?: "Anônimo"
        }
}

fun main() {
    val c = Cliente("")
    println(c.nome)

    val c2 = Cliente("amanda")
    println(c2.nome)

}
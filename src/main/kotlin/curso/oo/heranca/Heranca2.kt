package curso.oo.heranca

open class Animal(val nome: String)

class Cachorro : Animal {
    private val altura: Double

    //no construtor deve chamar o construtor da classe pai
    constructor(nome: String, altura: Double) : super(nome) {
        this.altura = altura
    }

    //tbm pode chamar o this, que vai chamar o construtor primário, que por sua vez chama o construtor da classe pai
    constructor(nome: String) : this(nome, 0.0)

    override fun toString(): String {
        return "$nome tem $altura cm de altura"
    }
}

fun main() {
    val labrador = Cachorro("Mel", 85.2)
    val dogAlemao = Cachorro("Spike")

    println(labrador)
    println(dogAlemao)
}
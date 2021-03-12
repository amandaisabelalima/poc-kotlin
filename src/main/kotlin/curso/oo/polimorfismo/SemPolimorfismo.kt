package curso.oo.polimorfismo


open class Comida(val peso: Double)
class Feijao(peso: Double) : Comida(peso)
class Arroz(peso: Double) : Comida(peso)


class Pessoa(var peso: Double) {
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

fun main() {
    val arroz = Arroz(0.3)
    val feijao = Feijao(0.3)

    val p = Pessoa(60.0)
    p.comer(arroz)
    p.comer(feijao)

    println("O peso da pessoa é ${p.peso}")
}
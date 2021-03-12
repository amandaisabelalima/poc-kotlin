package curso.oo.heranca

interface Esportivo {
    var turbo: Boolean

    fun ligarTurbo() {
        turbo = true
    }

    fun desligarTurbo() {
        turbo = false
    }
}
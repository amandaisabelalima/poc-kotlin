package curso

fun main() {
    val a: Int? = null
    println(a?.inc())

    println("Forçando null pointer exception...")

    println(a!!.inc()) //assumo o risco de chamar o metodo mesmo sabendo que a variavel pode ser nula
}
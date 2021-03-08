package curso

fun main() {

    val bomHumor = true
    println("Hoje estou ${if (bomHumor) "feliz" else "chateada" }")

    val a: Int = 18.dec()
    val b = a.toString()
    println("A = $a e B= ${b.first()}")

    val valor: Any = 123
    if(valor is String) {
        println("é string!")
    } else if (valor !is String) {
        println("não é string")
    }

}


fun printSum(a: Int, b: Int = 1): Int {
   return a + b
}
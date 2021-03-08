package curso

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "valor padrao"

    println(obrigatorio)
}
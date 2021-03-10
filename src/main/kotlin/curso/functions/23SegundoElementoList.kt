package curso.functions

fun<E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main() {
    val names = listOf("amanda", "gustavo", "sandra")
    println(names.secondOrNull())
}
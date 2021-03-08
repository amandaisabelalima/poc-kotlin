package curso

class Person (
    val name: String,
    val age: Int,
    var career: String

    //para ver essa classe decompilada para java: Tools > Kotlin > Show Kotlin Bytecode > Decompile

)


fun main() {
    val amanda: Person = Person("Amanda", 26, "dev")
    println("Profissão: ${amanda.career}")
}
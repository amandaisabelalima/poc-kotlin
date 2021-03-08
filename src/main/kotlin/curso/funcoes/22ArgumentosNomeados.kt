package curso.funcoes

fun detail(name: String, age: Int) {
    return println("$name tem $age anos")
}

fun main() {
    detail("Amanda", 26)

    detail(age = 26, name = "Amanda")
}
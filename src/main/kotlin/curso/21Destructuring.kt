package curso

data class Carro(
    val marca: String,
    val modelo: String
)

data class Pessoa(
    val nome: String,
    val idade: Int,
    val genero: String
)

fun main() {
    val(marca, modelo) = Carro("Ford", "Fusion")
    println("Marca = $marca")
    println("Modelo = $modelo")

    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido e $mulher")

    //assim nao funciona.. as variáveis são criadas pela ordem que foi definido e nao pelo nome
    //o genero = 26 nesse caso!
    val (nome, genero) = Pessoa("amanda", 26, "f")
    println("Nome = $nome e genero = $genero")

    //assim ignora os dois primeiros x'
    val(_, _, terceiroItem) = listOf(1, 2, 3)
    println(terceiroItem)
}
package curso

//var de nível elevado (fora de um método ou classe): pode ser utilizada em qualquer lugar no projeto, inclusive em outros arquivos
val year = 2021;

fun main() {
    println(year)

    val year = 2022; //aqui sobrescreve a var de nível elevada nesse método
    println(year)

    val name: String = "Amanda"
    println("Nome: $name")

    var age = 26;
    println("Idade: $age")

    age++
    println(age)


}
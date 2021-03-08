package curso

fun main() {

    //classe
    val fruits = ArrayList<String>()
    fruits.add("apple")
    fruits.add("banana")

    println(fruits)

    //função
    val itens = arrayListOf("apple", "banana")
    println(itens)
    println(itens.last())
    println(itens.first())

    //kotlin não tem as pŕoprias collections.. utiliza as do java
    println(ArrayList::class.java)


    val numbers = setOf(1, 14, 2)
    println(numbers)
    println(numbers.maxOrNull())

}
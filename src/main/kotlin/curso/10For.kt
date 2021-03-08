package curso


fun main() {
    for (number in 1..10) {
        println(number)
    }

    println("------------------------")

    for (i in 10 downTo 1) {
        println(i)
    }

    println("------------------------")

    for (i in 0..100 step 5) {
        println(i)
    }

    println("------------------------")

    val fruits = listOf("banana", "apple", "orange")
    for(fruit in fruits) {
        println(fruit)
    }
}
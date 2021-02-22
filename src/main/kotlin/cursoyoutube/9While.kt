package cursoyoutube

fun main() {
    var temperature: Int = 0
    var sum: Int = 0
    var amount: Int = 0

    while (temperature != 999) {
        println("enter a temperature or 999 to exit: ")
        temperature = readLine()!!.toInt() //!! - quer dizer que sempre será informado um número e toInt - convertido para inteiro

        if(temperature != 999) {
            sum += temperature
            amount++
        }
    }

    println("sum of temperatures: $sum")
    print("amount of temperatures reported: $amount")


}
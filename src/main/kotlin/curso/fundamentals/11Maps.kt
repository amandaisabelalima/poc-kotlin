package curso

import java.util.*

//imprimir as representações binárias dos caracteres de A a F
fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
        println(binaryRepresentation)
    }

    for((letter, binary) in binaryRepresentation) {
        println("representação binária de $letter = $binary")
    }
}
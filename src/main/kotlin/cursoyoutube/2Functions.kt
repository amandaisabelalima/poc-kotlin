package cursoyoutube

fun main(){
    println("NUMERO MAIOR: " + max(5,3))

    println("NUMERO MENOR: " + min(8, 2))
}

//função com corpo de bloco (tem o {}) -> obrigatório return e tipo de retorno declarado
fun max(number1: Int, number2: Int): Int {
    return if (number1 > number2) number1 else number2
    /*
        consigo usar o return junto com o IF pq em kotlin o if é uma expressão
        e toda expressão retorna um valor
     */
}


//função com corpo de expressão (não tem o {}) -> NÃO USA return e tipo de retorno declarado
fun min(number1: Int, number2: Int) = if (number1 < number2) number1 else number2

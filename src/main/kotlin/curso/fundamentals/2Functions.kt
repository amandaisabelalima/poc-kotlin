package curso

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


//função 6com corpo de expressão (não tem o {}) -> NÃO USA return e tipo de retorno declarado
fun min(number1: Int, number2: Int) = if (number1 < number2) number1 else number2


/*
Em Kotlin cada parâmetro de uma função é imutável e declarado val por padrão.
Por esse motivo não podemos fazer algo como fun soma(var a: Int, var b:Int){ }
ou será emitido um erro de compilação com a mensagem
'var' on function parameter is not allowed.


Toda vez que uma função não retornar dados significativos ela retornará Unit como padrão,
que corresponde a void em outras linguagens.
 */
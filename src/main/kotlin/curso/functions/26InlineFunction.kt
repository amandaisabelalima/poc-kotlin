package curso.functions

//melhora desempenho
//com função inline dá para executar coisas antes e depois de outra função
inline fun transaction(function: () -> Unit) {
    println(".. abrindo transacao....")
    try {
        function()
    } finally {
        println(".. fechando transacao....")
    }
}

fun main() {
    transaction { //corpo da funcao que passa como parametro
        println("executando query..")
        println("executando segunda query...")
    }
}
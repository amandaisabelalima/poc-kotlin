package curso.oo.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaoDisponivelAqui = 1 //disponível apenas em classes. Variavel top level nao
internal val dentroDoProjeto = 1
val publico = 1


private fun dentroDoArquivo() = 1
//protected fun protegidoNaoDisponivelAqui() = 1 //disponível apenas em classes. Metodo top level nao
internal fun dentroDoProjeto() = 1
fun publico() = 1

//open deixa ela aberta para ser herdada!!
open class Capsula() {
    private val dentroDoObjeto = 1
    protected val disponivelPorHeranca = 1
    internal val dentroDoProjeto = 1
    val public = 1

    private fun dentroDoObjeto() = 1
    protected fun disponivelPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun public() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcessos() {
        //println(Capsula().dentroDoObjeto)
        //println(Capsula().disponivelPorHeranca) //não é assim que acessa
        println(disponivelPorHeranca)
        println(dentroDoProjeto)
        println(public)
    }
}

fun verificarAcesso() {
    //println(Capsula().dentrodpObjeto())
    //println(Capsula().disponivelPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().public())
}
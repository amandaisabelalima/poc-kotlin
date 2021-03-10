package curso.lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("A",  " ", null, "B", null, "", "C", null, "D")

    //o let sempre retorna Unit
    for(item in listWithNulls) {
        //o call safe faz com que ele execute o que tem no let APENAS se nao for null
        item?.let {
            println(it.toLowerCase())
            println("-")
        }
    }
}

//o apply é mais flexível do que o let, pq com ele dá para ir encadeando chamadas e o retorno dele é
//o próprio objeto

//como o let retorna um Unit, nao tem como encadear outras coisas nele


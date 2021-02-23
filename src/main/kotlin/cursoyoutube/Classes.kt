package cursoyoutube

class Classes(
    //construtor primário
    val name: String,
    val age: Int,
    var city: String
) {
    constructor(name: String): this(name, 0, "blabla") //construtor secundario

}

fun main() {
    val test = Classes("amanda")
    val testTwo = Classes("amanda", 26, "matao")
    val testThree = Test()
    val testFour = Test(8, "construtor secundario")

}


class Test() {
    var number: Int = 0
    var description: String = ""

    constructor(number: Int, description: String) : this() //construtor secundario

    fun test() {
        this.number = number
        this.description = description
    }

    /*
    se tivesse criado o construtor secundário somente, sem as propriedades e setando
    elas no construtor, ao instanciar a classe Test pelo construtor secundário, nao
    daria para fazer nada com os valores, pq eles não são gerados.
    Então pra que serve o construtor secundario se poderia usar o primario logo de
    primeira? Para que serve o construtor secundário entao?
     */

    /*
    Diferente do construtor primário,
    os parâmetros do construtor secundário não gerarão propriedades
    se tentar fazer o seguinte comando, ocorre erro:
    val test = Test(8, "construtor secundario")
    test.number
     */
}



/*
No caso de uma classe possuir mais de um construtor, sendo um deles primário,
cada construtor secundário deve delegar ao construtor primário.
 */
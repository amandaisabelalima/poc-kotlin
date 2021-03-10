package curso.fundamentals

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar() : String{
        return "$dia/$mes/$ano";
    }
}

fun main() {
    var nascimento = Data(dia = 17, mes = 10, ano = 1994)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")

    with(nascimento) {
        println("$dia/$mes/$ano")
    }

    println(nascimento.formatar())
}
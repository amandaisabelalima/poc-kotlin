package curso.fundamentals

class ItemPedido(val nome: String, val preco: Double) {
    //tudo o que estiver aqui dentro é associado à classe, e não à instância.
    //são métodos e variáveis estáticos
    companion object {
        fun create(nome: String, preco: Double) = ItemPedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0 //variável static
    }

    fun precoDesconto() : Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemPedido.create("TV", 2895.50)
    val item2 = ItemPedido("Geladeira", 1840.0)

    //aplica o desconto para todas as instancias de ItemPedido, já que ela é uma variável de classe
    ItemPedido.desconto = 0.10

    println(item1.precoDesconto())
    println(item2.precoDesconto())
}

/*
percebe que o kotlin dificulta bastante para criar variável/método de classe
o mais indicado seria criar uma variável de top level ou criar variável de instancia normal

 */
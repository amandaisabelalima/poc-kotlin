package curso.collections

fun main() {
    var map = HashMap<Long, String>()

    map.put(10020030040, "amanda")
    map.put(90010020030, "bianca")
    map.put(50060070080, "joao")
    map.put(50060070080, "joao filho") //mesma chave, vai substituir

    for(item in map){
        println(item)
    }
    println("---------")

    for(valor in map.values) {
        println(valor)
    }
    println("---------")

    for(chave in map.keys) {
        println(chave)
    }

    for((chave, valor) in map) {
        println("$chave - $valor")
    }

    println(map.get(50060070080)) //o get acessa apenas pela key
    println(map.containsKey(50060070080))
    println(map.containsValue("joao filho"))


    val mapDois = hashMapOf(1 to "um", 2 to "dois", 3 to "tres")
    println(mapDois)
}
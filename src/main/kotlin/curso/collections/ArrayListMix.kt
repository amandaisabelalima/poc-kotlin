package curso.collections

fun main() {
    val listMix = arrayListOf("amanda", true, 1, 3.4, 'c')

    for (item in listMix) {
        //smart cast
        if(item is String) println(item.toUpperCase())

        if(item is Int) println(item.dec())

        if(item is Boolean) println(item.not())

        if(item is Double) println(item.toInt())

        if(item is Char) println(item)
    }

}
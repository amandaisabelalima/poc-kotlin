package cursoyoutube

fun getDescription(color: Color) =
    //switch do java
    when(color) {
        Color.RED -> "Vermelho"
        Color.YELLOW -> "Amarelo"
        Color.GREEN -> "Verde"
        Color.BLUE -> "Azul"
        Color.ORANGE -> "Laranja"
    }

fun getTemperature(color: Color): String {
    return when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Hot"
        Color.GREEN -> "Neutral"
        Color.BLUE -> "Cold"
    }
}


fun main() {
    println(getDescription(Color.RED))
    println(getTemperature(Color.YELLOW))
}
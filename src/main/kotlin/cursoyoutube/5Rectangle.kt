package cursoyoutube

class Rectangle(
    val height: Int,
    val width: Int
) {

    fun isSquare(): Boolean{
        return height == width
    }

    //acessor customizado - qual a diferença dele para a função acima???
    val isSquareeee: Boolean
        get() {
            return height == width

        }

    val isSquareTest
        get() = height == width
}


fun main() {
    val rectangle: Rectangle = Rectangle(2, 3)
    println(rectangle.isSquareeee)
    println(rectangle.isSquare())
}
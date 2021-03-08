package curso

import java.lang.IllegalArgumentException

//(1 + 2) + 4

interface Expression

class Number(
    val value: Int
) : Expression

class Sum(
    val left: Int,
    val right: Int
) : Expression

fun calculationWithIf(expression: Expression): Int {
    if(expression is Number) { //aqui o kotlin já faz o cast automaticamete para cursoyoutube.Number
        return expression.value
    }

    if(expression is Sum){
        return expression.left + expression.right
    }

    throw IllegalArgumentException("unknown expression")
}

fun calculationWithWhen(expression: Expression) =
    when(expression) {
        is Number -> {
            println("expression with number: ${expression.value}")
            expression.value //sempre retorna a últlima linha
        }
        is Sum -> expression.left + expression.right
        else -> throw IllegalArgumentException("unknown expression")
    }




fun main() {
    testSmartCast("amanda")
    testSmartCast(2)
    testSmartCastTwo(8.4)
}

fun testSmartCast(x: Any) {
    if(x is String) {
        println(x.toUpperCase()) //kotlin já faz o cast sozinho e consigo usar funções de String
    } else if(x is Int) {
        println(x.plus(3)) //a mesma coisa pra int
    }
}

fun testSmartCastTwo(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("me ajuda a te ajudar, amigo")
    }
}
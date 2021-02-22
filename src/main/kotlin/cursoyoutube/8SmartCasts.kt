package cursoyoutube

import java.lang.IllegalArgumentException
import kotlin.math.exp

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

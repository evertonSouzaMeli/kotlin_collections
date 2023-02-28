import java.math.BigDecimal
import java.math.RoundingMode.UP

fun main() {
    val x = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
        .map { salario: BigDecimal ->
            when {
                salario < "5000.00".toBigDecimal() -> salario.plus(BigDecimal(500))
                else -> (salario * BigDecimal(1.1)).setScale(2, UP)
            }
        }
        .forEach{ println(it)}
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return values.map { it.toBigDecimal() }.toTypedArray()
}
import java.math.BigDecimal
import java.math.RoundingMode.HALF_EVEN

fun calculaAumentoRelativo(salario: BigDecimal): BigDecimal? = when {
    salario < "5000.00".toBigDecimal() -> salario.plus(BigDecimal(500))
    else -> (salario * BigDecimal(1.1)).setScale(2, HALF_EVEN)
}

fun List<BigDecimal?>.somatoria(): BigDecimal = this.filterNotNull()
    .reduce { acumulador, valor -> valor + acumulador }


fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> =
    values.map { it.toBigDecimal() }.toTypedArray()


fun List<BigDecimal?>.media(): BigDecimal = this.filterNotNull()
    .let {
        when {
            this.isEmpty() -> BigDecimal.ZERO
            else -> this.somatoria() / this.size.toBigDecimal()
        }
    }

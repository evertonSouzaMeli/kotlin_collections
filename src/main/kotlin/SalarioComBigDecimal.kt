import java.math.BigDecimal

fun main() {
    bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
        .map { salario: BigDecimal -> calculaAumentoRelativo(salario) }
        .let {
            println("Salarios: $it")
            println("Somatoria: ${it.somatoria()}")
            println("Três ultimos salarios ${it.takeLast(3).toList().media()}")
        }
}
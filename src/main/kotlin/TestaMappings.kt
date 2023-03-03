import model.Pedido

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)

    )

    println(pedidos)

    val pedidosMapeados = pedidos.associateBy { it.numero }
    println(pedidosMapeados)

    val pedidoFreteGratis = pedidos.associateWith { it.valor > 50.0 }
    println(pedidoFreteGratis)
    println(pedidoFreteGratis[Pedido(numero = 1, valor = 20.0)])


}
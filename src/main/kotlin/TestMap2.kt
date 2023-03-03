fun main(){
    val valorPedido = pedidos.get(4)

    println(valorPedido)

    val message = pedidos.getOrElse(4) { "Não há esse valor" }

    println(message)

    val defaultValue = pedidos.getOrDefault(1, -1.0)

    println(defaultValue)

    println("### IMPRIMINDO CHAVES")
    println(pedidos.keys)

    println("### IMPRIMINDO VALORES")
    println(pedidos.values)


    pedidos.filter { (index, value) -> index % 2 == 0 && value > 50.0 }

    println(pedidos)


    println(pedidos + mapOf(7 to 90))
    pedidos.plusAssign(mapOf(2 to 9.0))
    pedidos.putAll(listOf(6 to 10.0, 8 to 20.0))
    println(pedidos)

}
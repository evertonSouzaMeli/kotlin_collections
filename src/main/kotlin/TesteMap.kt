val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)

    println(pedidos)

    pedidos[1].let {
        println("pedido $it")
    }

    pedidos.forEach {
        println("key: ${it.key}, value: ${it.value}")
    }

    pedidos[4] = 70.0

    pedidos.put(5, 80.0)

    pedidos[1] = 100.0

    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 300.0)

    println(pedidos)
}
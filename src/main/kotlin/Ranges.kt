fun main() {
    println("First Range")
    1.rangeTo(10).forEach { println(it) }

    println("\n")

    println("Second Range")
    (1..10 step 2).forEach { println(it) }

    println("\n")

    println("Third Range")
    println(2 in (1..10 step 2))

    println("\n")

    println("Fourth Range")
    ('a'..'z')
        .let {
            println('k' in it)
            println('K' in it)
        }

    println("\n")

    println("Fifth Range")
    intArrayOf(10, 12, 18, 33, 40, 67).let {
        println("Max age: ${it.max()}")
        println("Average age: ${it.average()}")
        println("All are of legal age? : ${it.all { value: Int -> value >= 18 }}")
        println("Is anyone of legal age? : ${it.any { value: Int -> value >= 18 }}")
        println("Only those of legal age? : ${it.filter { value: Int -> value >= 18 }}")
    }
}
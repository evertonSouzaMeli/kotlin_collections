fun main(){
    doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0)
        .map { it.plus(it * 0.1) }
        .forEach{ println(it) }
}
import model.BancoNomes

fun main() {
    val banco = BancoNomes()
    val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>

    banco.salva("Everton")
    nomesSalvos.add("João")

    println(nomesSalvos)

    val nomes: Collection<String> = mutableListOf("Everton", "João", "Maria", "José")

    println(nomes)
    println(nomes.contains("Everton"))
}
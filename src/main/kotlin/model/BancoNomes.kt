package model

class BancoNomes {
    val nomes: Collection<String> get() = dados.toList()

    companion object {
        private var dados = mutableListOf<String>()
    }

    fun salva(value: String) {
        dados.add(value)
    }
}
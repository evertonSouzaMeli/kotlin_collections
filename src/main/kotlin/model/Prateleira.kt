package model

class Prateleira(
    val genero: String,
    private val livros: MutableList<Livro>,
) {

    fun organizaLivrosPorAutor() : MutableList<Livro> {
        livros.sortBy { it.autor }
        return this.livros
    }

    fun organizaLivrosPorAnoPublicacao() : MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return this.livros
    }
}
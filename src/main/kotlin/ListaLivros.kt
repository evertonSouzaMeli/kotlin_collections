import model.Livro

fun main() {
    val listaLivros: MutableList<Livro> = mutableListOf(
        Livro(
            titulo = "Grande Sertão: Veredas",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1956
        ),

        Livro(
            titulo = "Minha vida de menina",
            autor = "Helena Morley",
            anoPublicacao = 1942,
            editora = "Editora A"
        ),

        Livro(
            titulo = "Memorias Postumas de Bras Cubas",
            autor = "Machado de Assis",
            anoPublicacao = 1881
        ),

        Livro(
            titulo = "Iracema",
            autor = "José de Alencar",
            anoPublicacao = 1865,
            editora = "Editora B"
        )
    )

    listaLivros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    println("#### LISTA DE LIVROS ##### \n${listaLivros.imprimeComMarcadores()}")

    val listaLivrosOrdenadaAno: List<Livro> = listaLivros.sorted()

    println("#### LISTA DE LIVROS ORDENADA ANO ##### \n${listaLivrosOrdenadaAno.imprimeComMarcadores()}")

    val listaLivrosOrdenadaAlfabetica = listaLivros.sortedBy { it.titulo }

    println("#### LISTA DE LIVROS ORDENADA TITULO ##### \n${listaLivrosOrdenadaAlfabetica.imprimeComMarcadores()}")

}

fun List<Livro>.imprimeComMarcadores(): String = this.joinToString("\n") {
    " - ${it.titulo} de ${it.autor}"
}
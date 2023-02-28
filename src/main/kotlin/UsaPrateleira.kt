import model.Prateleira

fun main(){
    val prateleira = Prateleira(genero = "Literatura", livros = listaLivros)

    println(prateleira.organizaLivrosPorAutor().imprimeComMarcadores())
    println(prateleira.organizaLivrosPorAnoPublicacao().imprimeComMarcadores())
}
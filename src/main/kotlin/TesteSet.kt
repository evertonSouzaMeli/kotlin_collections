fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")

    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")

    //val assistiramAmbos: Set<String> = assistiramCursoKotlin + assistiramCursoAndroid

    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)


    println("\n #### PRIMEIRO JOIN")
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println("\n #### SEGUNDO JOIN")
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println("\n #### TERCEIRO JOIN")
    println(assistiramCursoAndroid intersect  assistiramCursoKotlin)


    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")

    println(assistiramList.toSet())

}

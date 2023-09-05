fun main(){
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println("Array de números:")
    for (numero in numeros){
        println(numero)
    }
    val tamanhoArrayNomes = 5
    val nomes = arrayOfNulls<String>(tamanhoArrayNomes)
    
    println("\nDigite $tamanhoArrayNomes nomes para preencher o array")
    for (i in 0 until tamanhoArrayNomes){
        nomes[i] = readLine()
    }
    println("\nArray de nomes:")
    for ((index, nome) in nomes.withIndex()){
        println("[$index] $nome")
    }
    println("\nDigite o índice do nome que deseja buscar:")
    val indiceBusca = readLine()!!.toInt()
    
    if(indiceBusca in 0 until tamanhoArrayNomes){
        val nomeBuscado = nomes[indiceBusca]
        println("Nome no índice $indiceBusca: $nomeBuscado")
    } else {
        println("Índice inválido.")
    }
}
fun main(){
    var soma = 0
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println("Array de números:")
    for (numero in numeros){
        println(numero)
    }
    val tamanhoArrayNumero = 5
    val num = arrayOfNulls<Int>(tamanhoArrayNumero)
    
    println("\nDigite $tamanhoArrayNumero números para preencher o array")
    for (i in 0 until tamanhoArrayNumero){
        num[i] = readLine()?.toIntOrNull()
    }
    for (i in 0 until tamanhoArrayNumero){
        soma += num[i] ?: 0
    }
    println("A soma dos números inseridos é: $soma")
}
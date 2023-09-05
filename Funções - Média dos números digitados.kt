fun main(){
    val numeros = lerNumeros()
    
    if (numeros.isNotEmpty()) {
        val media = calcularMedia(numeros)
            println("A média dos números é:$media")
    } else {
        println("Nenhum número foi inserido.")
        }
}
fun lerNumeros(): List<Int> {
    println("Digite uma lista de números inteiros separados por espaços.")
        val input = readLine()
        
        return input?.split(" ")?.mapNotNull {
        it.toIntOrNull() } ?: emptyList()
}
fun calcularMedia(numeros: List<Int>):
Double{
    val soma = numeros.sum()
    return soma.toDouble() / numeros.size
}
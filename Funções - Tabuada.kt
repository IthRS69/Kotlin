fun main(){
    println("Digite um número inteiro")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null) {
        val tabuada1 = Tabuada2(numero)
        tabuada1.imprimirTabuada()
    } else {
        println("número inválido.")
    }
}
open class Tabuada (val numero: Int) {
    open fun calcularTabuada(): List<Int> {
        val tabuada = mutableListOf<Int>()
        for (i in 1..10) {
            tabuada.add(numero * i)
        }
        return tabuada
    }
}
class Tabuada2(numero: Int) : Tabuada(numero) {
    fun imprimirTabuada() {
        val tabuada = calcularTabuada()
        for (i in 1..10) {
            println("$numero x $i = ${tabuada[i - 1]}")
        }
    }
}
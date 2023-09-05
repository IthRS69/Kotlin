fun calcularEstatisticas(numeros: List<Double>): Triple<Double, Double, Double> {
    val quantidade = numeros.size
    val soma = numeros.sum()
    val media = soma / quantidade
    val maior = numeros.maxOrNull() ?: Double.NaN
    val menor = numeros.minOrNull() ?: Double.NaN

    return Triple(media, maior, menor)
}

fun contarParesImpares(numeros: List<Double>): Pair<Int, Int> {
    val pares = numeros.count { it % 2 == 0.0 }
    val impares = numeros.size - pares
    return Pair(pares, impares)
}

fun main() {
    val numeros = mutableListOf<Double>()
    var continuar: Boolean

    do {
        print("\nDigite um número (ou 'sair' para finalizar): ")
        val entrada = readLine()

        if (entrada?.equals("sair", ignoreCase = true) == true) {
            continuar = false
        } else {
            val numero = entrada?.toDoubleOrNull()

            if (numero != null) {
                numeros.add(numero)
                continuar = true
            } else {
                println("Entrada inválida. Digite um número válido ou 'sair' para finalizar.")
                continuar = true
            }
        }
    } while (continuar)

    if (numeros.isNotEmpty()) {
        val (media, maior, menor) = calcularEstatisticas(numeros)
        val (pares, impares) = contarParesImpares(numeros)
        println("\nMédia: $media")
        println("\nMaior número: $maior")
        println("\nMenor número: $menor")
        println("\nNúmeros pares: $pares")
        println("\nNúmeros ímpares: $impares")
    } else {
        println("\nNenhum número foi inserido.")
    }
}
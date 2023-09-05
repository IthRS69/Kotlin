fun main(){
    var positivo = 0
    var negativo = 0
    println("Contador de números positivos e negativos. Escolha a quantidade de números a ser inserido e em seguida digite os números escolhidos.")
    val  n = readLine()?.toIntOrNull()?: 0
    for (i in 1..n){
        val numero = readLine()?.toIntOrNull()
        if (numero != null) {
            if (numero > 0) {
                positivo++
            }else if (numero < 0) {
                negativo++
            }
        } else {
            println("Entrada inválida")
        }
    }
    println("Total de números positivos: $positivo")
    println("Total de números negativos: $negativo")
}
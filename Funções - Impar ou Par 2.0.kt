fun main(){
    val numero = solicitarNumero()
        verificarParOuImpar(numero)
}
fun solicitarNumero(): Int {
    println("Digite um número inteiro:")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null) {
        return numero
    }else {
        println("Entrada inválida. Por favor, digite um número inteiro.")
            return solicitarNumero()
    }
}
fun verificarParOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("$numero é um número par.")
    }else {
        println("$numero é um número impar.")
    }
}
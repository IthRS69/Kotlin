fun main(){
    println("Digite o primeiro número")
    val numero1 = readLine()?.toDoubleOrNull()
    println("Digite o segundo número")
    val numero2 = readLine()?.toDoubleOrNull()
    if(numero1 != null && numero2 != null){
        val maior = if (numero1 > numero2){
            numero1
        }else{
            numero2
        }
        println("O maior número é: $maior")
    }else{
        println("Entrada inválida. Digite valores válidos")
    }
}
fun main(){
    println("Digite o primeiro número")
        val numero1 = readLine()?.toDoubleOrNull()
    println("Digite o segundo número")
        val numero2 = readLine()?.toDoubleOrNull()
    println("Digite o terceiro número")
        val numero3 = readLine()?.toDoubleOrNull()
    if(numero1 != null && numero2 != null && numero3 != null){
        val maior = if (numero1 > numero2){
            numero1
        }else if(numero2 > numero3){
            numero2
        }else{
            numero3
        }
        println("O maior número é: $maior")
    }else{
        println("Entrada inválida. Digite valores válidos")
    }
}
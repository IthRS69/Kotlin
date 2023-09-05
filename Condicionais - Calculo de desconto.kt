fun main(){
    println("Digite o valor do seu salário")
    val valor = readLine()?.toIntOrNull()
    
    if (valor != null) {
        val desconto = valor * 0.1
        val valorComDesconto = valor - desconto
        if (desconto > 0) {
            println("Desconto de 10% aplicado: $desconto")
            println("Valor após desconto: $valorComDesconto")
        } else {
            println("Desconto não aplicado")
        }
    }
}
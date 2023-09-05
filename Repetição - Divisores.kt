fun main(){
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null){
        println("Divisores do número $numero:")
        
        var divisor = 1
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                println(divisor)
            }
            divisor++
        }
    }else {
        println("Número inválido. Digite um número válido.")
    }
}
fun main(){
    println("Digite um número inteiro:")
    val numero = lerNumero()
    
    if (numero % 2 == 0){
        println("$numero é um número par.")
    }else{
        println("$numero é um número impar.")
    }
}
fun lerNumero(): Int {
    val input = readLine()
    return if (input != null && input.toIntOrNull() != null){
        input.toInt()
    }else{
        println("Entrada inválida. Por favor, digite um número inteiro.")
            lerNumero()
    }
}
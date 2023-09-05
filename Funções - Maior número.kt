fun main(){
    println("Digite o primeiro número inteiro:")
    val numero1 = lerNumero1()
    println("Digite o segundo número inteiro:")
    val numero2 = lerNumero2()
    
    if (numero1 > numero2){
        println("$numero1 é o maior.")
    }else{
        println("$numero2 é o maior.")
    }
}
fun lerNumero1(): Int {
    val input = readLine()
    return if (input != null && input.toIntOrNull() != null){
        input.toInt()
    }else{
        println("Entrada inválida. Por favor, digite um número inteiro.")
            lerNumero1()
    }
}
fun lerNumero2(): Int {
    val input = readLine()
    return if (input != null && input.toIntOrNull() != null){
        input.toInt()
    }else{
        println("Entrada inválida. Por favor, digite um número inteiro.")
            lerNumero2()
    }
}
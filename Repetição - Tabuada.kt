fun main(){
    println("Digite um número inteiro:")
    val numero = readLine()?.toIntOrNull()
    
    if (numero != null){
        println("Tabuada do número: $numero:")
        for (i in 1..10){
            val resultado = numero * i
            println("$numero x $i = $resultado")
        }
    }else{
        println("Número inválido. Digite um número válido")
    }
}
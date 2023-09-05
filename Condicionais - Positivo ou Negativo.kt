fun main() {
    println("Digite um numero")
        val numero = readLine()?.toDoubleOrNull()
            if(numero != null){
                if(numero > 0){
                    println("O numero e positivo")
                }else if (numero < 0){
                    println("O numero e negativo")
                }else {
                    println("O numero e zero")}
            }else { println("numero invalido. Digite um numero valido")}
}
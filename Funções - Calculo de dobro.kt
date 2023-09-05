fun main(){
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()
    
    val dobro = calcularDobro(numero)
    println("O dobro de $numero é $dobro")
}
fun calcularDobro(numero: Int): Int{
    return numero * 2
}
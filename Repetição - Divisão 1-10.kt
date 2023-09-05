fun main(){
    println("Digite um número inteiro:")
    val numero = readLine()!!.toDouble()
    println("Tabuada do $numero:")
    for (i in 1..10){
        val resultado = numero / i
        println("$numero % $i = $resultado")
    }
}
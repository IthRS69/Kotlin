fun main (){
    val numeros = IntArray(10)
    println("Digite 10 números inteiros:")
    for (i in 0 until 10) {
        println("Número ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }
    val numeroUnico = numeros.toSet().toIntArray()
    println("Números sem duplicatas:")
    for (numero in numeroUnico){
        println(numero)
    }
}
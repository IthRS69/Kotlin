fun main(){
    println("Digite um número:")
    val i = readLine()?.toIntOrNull()
    if (i != null) {
        if (calcularPrimo(i)) {
            println("Esse número é primo.")
        } else {
            println("Esse número não é primo.")
        }
    } else {
        println("Entrada inválida. Digite um número válido.")
    }
}
fun calcularPrimo (i: Int): Boolean {
    var valor = 0
    if (i > 1) {
        for (a in 1..i) {
            if (i % a == 0) {
                valor++
            }
        }
        return valor <= 2
    } else {
        return false
    }
}
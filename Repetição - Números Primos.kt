fun main(){
    println("Digite um número")
    val i = readLine()?.toIntOrNull()
    var valor = 0
        if (i != null){
            for (a in 1..i){
                if (i % a == 0){
                    valor++
                }
            }
            if (valor <= 2){
                println ("Esse número é primo")
            }else{
                println("Esse número não é primo")
            }
        }else{
            println("Esse número não é primo")
        }
}
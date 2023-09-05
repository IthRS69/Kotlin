fun main() {
    println("Digite um número")
        val num = readLine()?.toIntOrNull()
            if (num != null){
                if (num % 2 == 0){
                    println("Esse número é par")
                }else{
                    println("Esse número é impar")}}
}
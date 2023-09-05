fun main() {
    println("Digite sua idade")
        val num = readLine()?.toDoubleOrNull()
            if(num != null){
                if(num > 18){
                    println("Maior de idade")
                }else if (num < 18){
                    println("Menor de idade")}}
}
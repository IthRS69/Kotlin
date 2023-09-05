fun main(){
    var sum = 0 
    var num = 0
    var inserir: Int
    
    do{
        println("Digite um número inteiro (ou 0 para sair):")
        inserir = readLine()!!.toInt()
        
        if (inserir != 0) {
            sum += inserir
            num++
        }
    }while (inserir != 0)
    
    if (num > 0) {
        val average = sum.toDouble() / num
        println("A média dos números lidos é: $average")
    }else{
        println("Nenhum número foi lido.")
    }
}
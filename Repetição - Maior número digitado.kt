fun main(){
    var sum = 0
    var num = 0
    var inserir: Int
    var maiorNumero = Int.MIN_VALUE
    
    do{
        println("Digite um número inteiro (ou -1 para sair):")
        inserir = readLine()!!.toInt()
        
        if (inserir != 0) {
            sum += inserir
            num++
            
            if (inserir > maiorNumero) {
                maiorNumero = inserir
            }
        }
    }while (inserir != -1)
    
    if (num > 0) {
        println("O maior número digitado é: $maiorNumero.")
    }else{
        println("Nenhum número foi lido.")
    }
}
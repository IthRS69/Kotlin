fun main(){
    println("Digite seu nome:")
    val nome = readLine()
    
    println("Digite sua idade:")
    val idade = readLine()?.toIntOrNull()
    
    if(idade != null){
        if(idade >= 18){
            println(" $nome, você é maior de idade ")
        }else{
            println(" $nome, você é menor de idade ")}
    }
}
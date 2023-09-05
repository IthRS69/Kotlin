fun main(){
    println("Digite sua idade")
    val idade = readLine()?.toIntOrNull()
    println("Você é estudante? (Responda 'S' para sim e 'N' para não)")
    var letra = readLine()
        if(idade != null){
            if(idade >= 18){
                println("Você é maior de idade")
            }else if(idade < 18){
                println("Você é menor de idade")
            }else{
                println("Resposta inválida, responda corretamente")}
        }
        if(letra != null && letra.length == 1){
            if(letra == "s" || letra == "S"){
                println("Você é estudante")
            }else if(letra == "n" || letra == "N"){
                println("Você não é estudante")
            }else{
                println("Resposta inválida, responda corretamente")}
        }
}
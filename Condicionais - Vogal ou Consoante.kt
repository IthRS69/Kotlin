fun main() {
    println("Digite uma letra:")
    var letra = readLine()
        if(letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U"){
            println("A letra $letra e uma vogal")
        }else if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
            println("A letra $letra e uma vogal")
        }else{
            println("A letra $letra é uma consoante")
        }
}
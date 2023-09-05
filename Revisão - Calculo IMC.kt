fun main(){
    println("Calculadora de IMC")
    
    println("Digite seu nome:")
    val nome = readLine()!!
    
    println("Digite seu peso (em kg):")
    val peso = readLine()!!.toDouble()
    
    println("Digite sua altura (em metros):")
    val altura = readLine()!!.toDouble()
    
    val imc = calcularIMC(peso, altura)
    var imcIdeal = calcularIMCIdeal(altura)
    println("$nome, seu IMC atual é: $imc")
    
    if (imc < 18.5) {
        println("Você está abaixo do IMC ideal.")
        println("\nDicas para alcançar seu IMC ideal:")
        println("\nAumente a ingestão de calorias saudáveis.")
        println("\nInclua proteínas magras e alimentos ricos em nutrientes.")
        println("\nPratique atividades físicas regularmente.")
    } else if (imc > 25.0) {
        println("Você está acima do IMC ideal.")
        println("\nDicas para alcançar seu IMC ideal:")
        println("\nReduza a ingestão de alimentos ricos em gordura e açúcar.")
        println("\nFaça exercícios aeróbicos e anaeróbicos regularmente.")
        println("\nMantenha uma dieta equilibrada e controlada.")
    } else {
        println("Parabéns, $nome! Você está no nível ideal do seu IMC.")
        println("\nContinue mantendo hábitos saudáveis para menter-se assim.")
    }
}
fun calcularIMC (peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}
fun calcularIMCIdeal (altura: Double): Double {
    return 22.0 * (altura * altura)
}
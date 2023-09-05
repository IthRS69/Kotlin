fun main() {
    var a: Double = 3.14
        println("Resposta $a")
    
    var b: Boolean = false
        b = true
        println(b)
    
    var c: String = "Hello World"
        println(c)
    
    var d: Int = 10
    var er: String = "20"
        println("$d e $er")
    
    val numeroString1 = 17
    val numeroString2 = 18
        val numeroInt1 : Int= numeroString1.toInt()
        val numeroInt2 : Int= numeroString2.toInt()
             val resultadoSoma : Int= numeroInt1 + numeroInt2
                println("Número 1 (String) : $numeroString1")
                println("Número 2 (String) : $numeroString2")
                println("Número 1 (Int) : $numeroInt1")
                println("Número 2 (Int) : $numeroInt2")
                println("Resultado da soma : $resultadoSoma")
    
    val f: Int = 1
    val numeroChar1 = `a`
        val numeroInt3 : Int= numeroChar1.toInt()
            val resultadoSoma2 : Int= numeroInt3 + f
                println("Número 1 (Int) : $f")
                println("Número 2 (Char) : $numeroChar1")
                println("Número 3 (Int) : $numeroInt3")
                println("Resultado da soma : $resultadoSoma2")
    
    val g: Double = 5.5
    val numeroInt4 = 3
        val numeroDouble1 : Double= numeroInt4.toDouble()
            val resultadoDivisao : Double= g / numeroDouble1
                println("Número 1 (Double) : $g")
                println("Número 2 (Int) : $numeroInt4")
                println("Número 3 (Double) : $numeroDouble1")
                println("Resultado da Divisão : $resultadoDivisao")
    
    var h: Boolean = false
        h= true
            println(h)
    
    val frase: String = "Ithalo"
        val tamanho = frase.length
            println("$tamanho caracteres")
    
    val i: Int = 10
    val numeroChar2 = 'z'
        val numeroInt5 : Int= numeroChar2.toInt()
            val resultadoSoma3 : Int= i + numeroInt5
                println("Número 1 (Int) : $i")
                println("Número 2 (Char) : $numeroChar2")
                println("Número 3 (Int) : $numeroInt5")
                println("Resultado da soma : $resultadoSoma3")
    
}
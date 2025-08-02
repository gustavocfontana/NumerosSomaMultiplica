fun main () { // Gustavo da Costa Fontana
    println("Digite o primeiro numero:")
    val primeiroNumero = readln().toDouble()

    println("Digite o segundo numero:")
    val segundoNumero = readln().toDouble()

    val soma = primeiroNumero + segundoNumero
    val resultadoFinal = soma * primeiroNumero

    println("O primeiro numero lido foi $primeiroNumero, o segundo numero lido foi $segundoNumero. O resultado final eh: $resultadoFinal.")
}
fun main() {
    println("Seja bem-vindo ao KotCal! Escolha seu tipo de operação")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> adicao()
        2 -> subtracao()
        3 -> divisao()
        4 -> multiplicacao()
        else -> println("Opção inválida")
    }
}

fun adicao() {
    print("ADIÇÃO - Digite o primeiro valor: ")
    val valor1 = readln().toDouble()
    print("Digite o segundo valor: ")
    val valor2 = readln().toDouble()
    val resultado = valor1 + valor2
    print("O resultado é: $resultado")
}

fun subtracao() {
    print("SUBTRAÇÃO - Digite o primeiro valor: ")
    val valor1 = readln().toDouble()
    println("Digite o segundo valor: ")
    val valor2 = readln().toDouble()
    val resultado = valor1 - valor2
    print("O resultado é: $resultado")
}

fun divisao() {
    print("DIVISÃO - Digite o primeiro valor: ")
    val valor1 = readln().toDouble()
    print("Digite o segundo valor: ")
    val valor2 = readln().toDouble()
    val resultado = valor1 / valor2
    print("O resultado é: $resultado")
}

fun multiplicacao() {
    print("MULTIPLICAÇÃO - Digite o primeiro valor: ")
    val valor1 = readln().toDouble()
    print("Digite o segundo valor: ")
    val valor2 = readln().toDouble()
    val resultado = valor1 * valor2
    print("O resultado é $resultado")
}
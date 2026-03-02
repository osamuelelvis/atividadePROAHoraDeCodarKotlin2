fun main() {
    print("Informe o primeiro número: ")
    val num1 = readln().toInt()
    print("Agora informe o segundo número (não pode ser igual ao anterior): ")
    val num2 = readln().toInt()
    print("Por fim, informe o terceiro número: ")
    val num3 = readln().toInt()

    var menor = num1
    if (num2 < menor) {
        menor = num2
    }
    if (num3 < menor) {
        menor = num3
    }
    var soma = num1 + num2 + num3 - menor
    println("A soma dos dois maiores números é: $soma")
}
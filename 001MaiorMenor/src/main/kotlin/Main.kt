fun main() {
    print("Informe o primeiro número: ")
    val num1 = readln().toInt()
    print("Ótimo! Agora informe o segundo número: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("O número $num1 é maior que o número $num2")
    } else {
        println("O número $num2 é maior que o número $num1")
    }
}
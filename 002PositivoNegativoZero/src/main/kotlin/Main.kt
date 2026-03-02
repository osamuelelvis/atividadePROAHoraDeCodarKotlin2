fun main() {
    print("Digite um número: ")
    val valor_informado = readln().toInt()
    if (valor_informado > 0) {
        println("O número é positivo.")
    } else if (valor_informado < 0) {
        println("O número é negativo.")
    } else {
        println("O número é zero.")
    }
}
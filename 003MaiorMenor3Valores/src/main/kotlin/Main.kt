// 3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
fun main() {
    print("Informe o primeiro número: ")
    val num1 = readln().toInt()
    print("Ótimo! Agora informe o segundo número: ")
    val num2 = readln().toInt()
    print("Por fim, agora informe o terceiro número: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3) {
        println("O número $num1 é maior.")
    } else if (num2 > num3) {
        println("O número $num2 é maior.")
    } else {
        println("O número $num3 é maior.")
    }
}

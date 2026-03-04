// 5.  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
fun main() {
    var soma = 0

    for (i in 1..6) {
        print("Informe o $i º número: ")
        val numero = readln().toInt()

        println("Valor digitado: $numero")

        soma += numero
    }
    val media = soma.toDouble() / 6
    print("Média final: $media")
}

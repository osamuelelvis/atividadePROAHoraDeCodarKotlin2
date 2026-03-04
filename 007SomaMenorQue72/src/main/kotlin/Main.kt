// 7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
fun main() {
    var soma = 0

    for (i in 1..6) {
        print("Informe o $i º número: ")
        val numero = readln().toInt()

        if (numero < 72) {
            soma += numero
        }
    }
    print("A soma dos números menores que 72 é: $soma")
}

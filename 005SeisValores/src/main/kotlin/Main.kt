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
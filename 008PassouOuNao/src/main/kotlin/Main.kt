fun main() {
    var soma = 0;

    for (i in 1..4) {
        print("Informe o $i º número: ")
        val numero = readln().toInt()

        if (numero >= 0 && numero <= 10) {
            soma += numero
        }
    }
    var media: Double = soma / 4.0
    println("Sua média final: $media")
    if (media > 5){
        println("Parabéns, você passou!")
    } else {
        println("Que pena, você não passou! Tente novamente.")
    }
}
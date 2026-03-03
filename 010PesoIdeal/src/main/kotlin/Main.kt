fun main() {
    var h: Double
    var genero: String
    var pesoIdeal: Double

    print("Digite sua altura: ")
    h = readln().toDouble()

    print("Digite seu gênero (M/F): ")
    genero = readln().uppercase()

    if (genero == "M") {
        pesoIdeal = (72.7 * h) - 58
    } else {
        pesoIdeal = (62.1 * h) - 44.7
    }
    print("Seu peso ideal é: $pesoIdeal")
}
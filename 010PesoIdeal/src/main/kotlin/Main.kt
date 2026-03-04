// 10. Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.
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

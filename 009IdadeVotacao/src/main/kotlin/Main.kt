fun main() {
    val ano_atual = 2026;
    val ano_nascimento: Int;

    print("É necessário ter pelos menos 16 anos para votar. Digite seu ano de nascimento para confirmar sua elegibilidade para voto: ")
    ano_nascimento = readln().toInt()

    var idade = ano_atual - ano_nascimento
    println("Sua idade é: $idade anos.")
    if (idade >= 16) {
        println("Você está apto a votar!")
    } else {
        println("Não pode votar, sinto muito.")
    }
}
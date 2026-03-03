//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

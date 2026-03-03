fun main() {
    var num1: Int
    var num2: Int
    var num3: Int
    var num4: Int

    print("Informe o 1º número: ")
    num1 = readln().toInt()
    print("Informe o 2º número: ")
    num2 = readln().toInt()
    print("Informe o 3º número: ")
    num3 = readln().toInt()
    print("Informe o 4º número: ")
    num4 = readln().toInt()

    var maior = num1
    if (num2 > maior) {
       maior = num2
    }; if (num3 > maior) {
        maior = num3
    }; if (num4 > maior) {
        maior = num4
    }

    println("Primeiro número: $num1")
    println("Último número: $num4")
    println("Maior número: $maior")
}
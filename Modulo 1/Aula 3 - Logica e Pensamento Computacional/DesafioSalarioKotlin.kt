import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite seu salário bruto: ")
    val salarioBruto = scanner.nextFloat()

    println("Digite o valor somado dos benefícios: ")
    val beneficios = scanner.nextFloat()

    val imposto = calcularImposto(salarioBruto)

    val salarioLiquido = (salarioBruto - imposto) + beneficios

    println("Seu salário líquido é de: R$%.2f".format(salarioLiquido))
}

fun calcularImposto(salario: Float): Float {
    var aliquota = 0f

    if (salario >= 0.01f && salario <= 1100.00f) {
        aliquota = 0.05f
    } else if (salario > 1100.00f && salario <= 2500.00f) {
        aliquota = 0.10f
    } else if (salario > 2500.00f) {
        aliquota = 0.15f
    } else {
        println("Valor do salário não pode ser menor que 0,01")
    }

    return aliquota * salario
}
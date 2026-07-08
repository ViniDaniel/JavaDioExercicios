using System;

class DesafioCSharp
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite seu salário bruto: ");
        float salarioBruto = float.Parse(Console.ReadLine());

        Console.WriteLine("Digite o valor somado dos benefícios: ");
        float beneficios = float.Parse(Console.ReadLine());

        float imposto = CalcularImposto(salarioBruto);

        float salarioLiquido = (salarioBruto - imposto) + beneficios;

        Console.WriteLine($"Seu salário líquido é de: R${salarioLiquido:F2}");
    }

    static float CalcularImposto(float salario)
    {
        float aliquota = 0f;

        if (salario >= 0.01f && salario <= 1100.00f)
        {
            aliquota = 0.05f;
        }
        else if (salario > 1100.00f && salario <= 2500.00f)
        {
            aliquota = 0.10f;
        }
        else if (salario > 2500.00f)
        {
            aliquota = 0.15f;
        }
        else
        {
            Console.WriteLine("Valor do salário não pode ser menor que 0,01");
        }

        return aliquota * salario;
    }
}
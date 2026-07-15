salarioBruto = float(input("Digite seu salário: "))
beneficio = float(input("Digite o valor do seu beneficio somado: "))
imposto = 0

if salarioBruto >= 0.01 and salarioBruto <= 1100.00:
    imposto = 0.05 * salarioBruto
elif salarioBruto > 1100.00 and salarioBruto <= 2500.00:
    imposto = 0.1 * salarioBruto
elif salarioBruto > 2500.00:
    imposto = 0.15 * salarioBruto
else:
    print("Digite um valor maior que zero")

salarioLiquido = (salarioBruto - imposto) + beneficio

print(f"O seu salário é de R${salarioLiquido:.2f}")
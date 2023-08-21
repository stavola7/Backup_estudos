sexo = int(input("Insira: 1- sexo masculino / 2- sexo feminino: "))
h = float(input("Altura:'"))
peso = float(input("Peso:"))

peso_Ideal = (72.7*h) - 58 if sexo == 1 else (62.1*h) - 44.7

if peso < peso_Ideal:
	print("Abaixo do peso ideal!")
elif peso == peso_Ideal:
	print("Dentro do peso ideal!")
else:
	print("Acima do peso ideal!")



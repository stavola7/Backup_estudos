peso = float(input("Insira o peso dos peixes que joao trouxe "))
pesoLimite = 50
excesso = peso - pesoLimite
multa = excesso * 4.00

if peso > pesoLimite:
    print ("Multa foi de " + str(multa) + " reais")
else: 
    print("Dentro do peso ideal")
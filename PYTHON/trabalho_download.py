tamanho = int(input("Insira o tamanho do arquivo em MB "))
velocidade = int(input("Insira a velocidade da sua internet atual em Mbps"))
download = tamanho/velocidade

minutos = int(download/60)
segundos = minutos/60
print("O download ira demorar: " + str(download) + "minutos e " + str(segundos) + "segundos")

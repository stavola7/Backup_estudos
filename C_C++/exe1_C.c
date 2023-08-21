#include <stdio.h>
#include <stdlib.h>

int main () {
    int anoNascimento, idade;
    float salarioBruto, abono;
    char sexo;
    
    printf("Informe o ano de Nascimento : ");
    scanf("%d", &anoNascimento);
    
    printf("Informe o salario : ");
    scanf("%f", &salarioBruto);
    
    printf("Informe sua idade : ");
    scanf("%d", &idade);
    
    if (anoNascimento <= 1982){
    	printf("O valor do abono eh  %f", abono = salarioBruto * 0.15);
	}
	else{
		printf("O valor do abono eh  %f" , abono = salarioBruto * 0.25 );	
		
	}
	
	printf("\n\nSalario acrescido do abono eh %f ", abono + salarioBruto);
    
    
    
}
    


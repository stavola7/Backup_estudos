#include <stdio.h>

int main()

{
    float CL;
        
    printf("Informe o valor da Conta de Luz: ");
    scanf("%f", &CL);

    if(CL > 50){
        printf(" Voce gastou muito");
    }
    
    else {
        printf(" Seu gasto foi normal");
    }        

}

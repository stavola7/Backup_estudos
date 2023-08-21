#include <stdio.h>
#include <conio.h>
int main(void)
{
  int n1,n2,resto,res;
  
  printf ("\nDigite um numero:");
  scanf ("%d", &n1);
  
  printf ("\nDigite um numero:");
  scanf ("%d", &n2);
  
  res = n1 / n2;
  
  printf("\nResultado da divisao de %d / %d = %d. \n",n1,n2,res);
  
  getch();
  return(0);

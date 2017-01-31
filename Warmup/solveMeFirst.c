#include <stdio.h>//the library that contains the scanf and printf functions

int solveMeFirst(int a, int b) 
{
  return a+b;//just return the sum
}
int main()
{
  int num1,num2;
  scanf("%d %d",&num1,&num2);//this will fail if you too big a number
  int sum; 
  sum = solveMeFirst(num1,num2);//call that function
  printf("%d",sum);//note that sum has to be of type integer
  return 0;
}

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int k; 
    scanf("%d %d",&n,&k);
   int A[n];
    for(int i=0;i<n;i++)
        scanf("%d",&A[i]);
    
    int E=100,j=0;
    
    j=(j+k)%n;
    if(A[j]==1)E=E-3;
    else E=E-1;
    
    while(j!=0)
        {
           j=(j+k)%n;
          if(A[j]==1)E=E-3;
          else E=E-1;
       }
    
    printf("%d",E);
    return 0;
}

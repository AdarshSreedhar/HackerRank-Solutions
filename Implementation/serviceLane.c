#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int i,n,t,j,k;
   scanf("%d%d",&n,&t);
    int A[n];
    for(i=0;i<n;i++)
    {
      scanf("%d",&A[i]);  
    }
     for(i=0;i<t;i++)
    {
       
        scanf("%d%d",&j,&k);
         int min=A[j];
        while(j<=k)
            {
             if(A[j]<min)min=A[j];
             j++;
            }
        printf("%d\n",min);
    }
    return 0;

}
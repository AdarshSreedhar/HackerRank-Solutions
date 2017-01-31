#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int i,n;
   scanf("%d",&n);
   int A[n];
    for(i=0;i<n;i++)
        scanf("%d",&A[i]);
    int pos=0,neg=0,zero=0;
    for(i=0;i<n;i++)
        {
          if(A[i]<0)neg++; 
          else if(A[i]>0)pos++;
          else zero++;
        }
        //note that the precision has to be only 6 digits
     printf("%0.6lf\n",((double)pos/n));
     printf("%0.6lf\n",((double)neg/n));
     printf("%0.6lf\n",((double)zero/n));
    return 0;
}
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int n,i,numofcyc,h=1;
   scanf("%d",&n);
   for(i=0;i<n;i++)
      {
        scanf("%d",&numofcyc);
        int m=0;
        h=1;
        while(numofcyc>0)
        {
            if(m==0)
                {
                    h*=2;
                    m=1;
                    numofcyc--;
                }
             else if(m==1)
                {
                    h+=1;
                    m=0;
                    numofcyc--;
                }
        }
         printf("%d\n",h);
      }
   
    return 0;
}

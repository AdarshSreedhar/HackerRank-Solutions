#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int i,n,t,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        {
          int y=0;
          scanf("%d",&t);
          int c=t;
          int count=0;
           while(c>0)
          {
               c=c/10;
              count++;
          }
             int A[count];
             c=t;
              for(j=0;j<count;j++)
            {
              A[j]=c%10;
                  c=c/10;
            }
        
         for(j=0;j<count;j++)
            {
                 if(A[j]!=0&&t%A[j]==0)
                 y++;
             
            }
         printf("%d\n",y);
        }
    return 0;
}

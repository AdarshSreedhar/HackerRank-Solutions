#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
void check(int A[],int numofstud,int thresh);
int main()
{
    int n,numofstud,thresh,i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        {
            scanf("%d %d",&numofstud,&thresh);
                 int A[numofstud];
                for(j=0;j<numofstud;j++)
                {
                    scanf("%d",&A[j]);
                }
            check(A,numofstud,thresh);
        }
    return 0;
}
void check(int A[],int numofstud,int thresh)
{
    int count=0; 
    for(int k=0;k<numofstud;k++)
      {
         if(A[k]<=0)count++;
     }
    if(count>=thresh)printf("NO\n");
    else printf("YES\n");
    
}

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n,d,i,count;

    scanf("%d%d",&n,&d);
    int A[n];
    for(i=0;i<n;i++)
        scanf("%d",&A[i]);
    
    for(i=0;i<n-2;i++)
    {
        int t1=A[i];
        int t2=t1+d;
        int t3=t2+d;
        
       for(int j=i+1;j<n-1;j++)
           {
                if(A[j]==t2)
               {
                    for(int k=j+1;k<n;k++)
                        {
                            if(A[k]==t3)count++;
                        }
                }
            }
     }
         printf("%d",count);
    return 0;
}

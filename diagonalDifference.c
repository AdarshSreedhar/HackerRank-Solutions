#include <math.h>
#include <stdio.h>

int main()
{
    int i,n,j;
    scanf("%d",&n);
    int A[n][n];
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
          scanf("%d",&A[i][j]);
       int sum1=0;
       int sum2=0;
       j=(n-1);
        for(i=0;i<n;i++)
            {
              sum2=sum2+A[j][i];
              sum1=sum1+A[i][i];
              j--;
            }
    printf("%d",abs(sum1-sum2));
    return 0;
}
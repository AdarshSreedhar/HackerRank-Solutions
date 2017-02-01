#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int findmin(int A[],int n);
int main()
{
    int n,k,i;
    scanf("%d",&n);
    int A[n];
    for(k=0;k<n;k++)scanf("%d",&A[k]);
    printf("%d\n",n);
	int count=1;
	while(count>0)
	{
     int min=findmin(A,n);
     for(i=0;i<n;i++)A[i]=A[i]-min;
	 count=0;
        
	 for(i=0;i<n;i++)
	{
	  if(A[i]>0)count++;
	}
        if(count>0)
	printf("%d\n",count);
	}
    return 0;
}

int findmin(int A[],int n)
{
 int j=0;
 while(A[j]<=0)j++;
 int mint=A[j];
 for(int j=0;j<n;j++)
     {
        if(A[j]>0&&A[j]<mint)
            mint=A[j];
     }
  return mint;
}
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int i,n,j,k;
    scanf("%d",&n);
    int numofsp=n-1;
	int numofhash=1;
	for(k=0;k<n;k++)
	{
	 for(i=0;i<numofsp;i++)printf(" ");
	 for(j=0;j<numofhash;j++)printf("#");
	 printf("\n");
	 numofhash++;
	 numofsp--;
	}
	return 0;    
}

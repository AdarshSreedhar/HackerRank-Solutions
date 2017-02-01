#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    scanf("%d",&n);
    int A[n];
    for(int i=0;i<n;i++)
        {
        scanf("%d",&A[i]);
    }
    int min=n;
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
         if(A[i]==A[j])
        {
        if(abs(i-j)<min)min=abs(i-j);
    }
    if(min<n)
    printf("%d\n",min);
    else printf("-1\n");
    
    return 0;
}

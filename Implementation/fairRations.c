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
    scanf("%d",&A[i]);
    int count=0;
    int check=0;
    for(int i=0;i<n;i++)if(A[i]%2==1)check++;
        
        if(check%2==1)printf("NO\n");
    
        else
        {
        for(int i=0;i<n-1;i++)
            {
            if(A[i]%2==1){A[i]++;A[i+1]++;count+=2;}
        }
        
        printf("%d",count);
    }
    
    return 0;
}

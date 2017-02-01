#include <stdio.h>
int main()
{
    int n,k; 
    scanf("%d %d",&n,&k);
    int A[n];
    int count=0;
    
   for(int i=0;i<n;i++)
        scanf("%d",&A[i]);
    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)
            if((A[i]+A[j])%k==0)
                count++;
    printf("%d",count);
    return 0;
}
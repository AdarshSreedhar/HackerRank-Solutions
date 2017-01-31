#include <stdio.h>
//since they've specified that the array sum is an integer,the sum will not exceed integer limits
//which is very likely as sum  of integers can cause overflow
int main()
{
    int n,i;
    scanf("%d",&n);
    int A[n];
     for(i=0;i<n;i++)
          scanf("%d",&A[i]);
     int sum=0;
    for(i=0;i<n;i++)
        sum+=A[i];
    printf("%d",sum);  
    return 0;
}
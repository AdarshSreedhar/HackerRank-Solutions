#include <stdio.h>
#include <limits.h>
int main()
{
    int n,i; 
    scanf("%d",&n);
    int arr[n];
    for(i = 0; i < n; i++)
        scanf("%d",&arr[i]);
    long long sum=0;//this is necessary because it will go out of limits for integers
    for(i=0;i<n;i++)
        sum=sum+arr[i];
    printf("%lld",sum);//check out the specifier for long long
    return 0;
}
//an unsigned long long should have a range from 0 to 2^64-1.

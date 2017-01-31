#include <stdio.h>
int main()
{
    int a0,a1,a2; 
    scanf("%d %d %d",&a0,&a1,&a2);
    int b0,b1,b2; 
    scanf("%d %d %d",&b0,&b1,&b2);
    int c1=0,c2=0;
    if(a0!=b0)
        a0>b0?c1++:c2++;
    if(a1!=b1)
        a1>b1?c1++:c2++;
    if(a2!=b2)
        a2>b2?c1++:c2++;
    printf("%d %d",c1,c2);
    return 0;
}

#include<stdio.h>
#include<stdlib.h>
int main()
    {
    int n,q,r,index;
    scanf("%d%d%d",&n,&r,&q);
    int A[n];
    for(int i=0;i<n;i++)scanf("%d",&A[i]);
    
   for(int i=0;i<q;i++)
       {
       scanf("%d",&index);
       for(int j=0;j<r;j++)
       {
         if(index>0)index--;
         else index=n-1;
       }
       printf("%d\n",A[index]);
   }
        return 0;
}
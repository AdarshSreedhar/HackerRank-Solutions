#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

//int findnearestspacestation(int A[],int i,int n);
void sort(int A[],int ns);
int main()
    {
    int n,ns;
    scanf("%d%d",&n,&ns);
    
    int A[ns];
    for(int i=0;i<ns;i++)scanf("%d",&A[i]);
    sort(A,ns);
    int max=A[0];
    
    for(int i=0;i<ns-1;i++)
        {
            int left=A[i];
            int right=A[i+1];
            int gd=floor((right-left)/2);
            if(gd>max)max=gd;
        }
    
    int distfromlast=n-1-A[ns-1];
    if(distfromlast>max)max=distfromlast;
    
    printf("%d",max);
    return 0;
}

void sort(int A[],int ns)
    {
    for(int i=0;i<ns-1;i++)
        for(int j=0;j<ns-1-i;j++)
        {
          if(A[j]>A[j+1])
              {
                int temp=A[j];
              A[j]=A[j+1];
              A[j+1]=temp;
                }
        }
}
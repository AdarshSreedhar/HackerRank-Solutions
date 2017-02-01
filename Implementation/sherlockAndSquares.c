#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
   int i,n;
   double low,high;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    scanf("%d",&n);
        for(i=0;i<n;i++)
        {
         int count=0;
         scanf("%lf%lf",&low,&high);
            int y=ceil(sqrt(low));
            while(y*y<=high)
            {
                count++;
                y++;
            }
        printf("%d\n",count);
        }
    return 0;
}

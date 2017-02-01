#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,t,m,s;
    scanf("%d",&t);
    for(int i=0;i<t;i++)
        {
        scanf("%d%d%d",&n,&m,&s);
        if(m%n==0)
        {
            if(s==1)printf("%d\n",n);
            else printf("%d\n",s-1);
        }
        
        else 
            {
             m=m%n;
            if((s+m)>(n+1))
                printf("%d\n",((s+m)%n-1));
               
                       else printf("%d\n",(s+m-1));
                       }
  
}
  return 0;
                       }
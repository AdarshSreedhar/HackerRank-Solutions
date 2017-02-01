#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
    { int j,i,n,c,m;
    scanf("%d",&j);
        for(i=0;i<j;i++)
        {
        scanf("%d%d%d",&n,&c,&m);
        int numofchoc=0;
        int remainingwrappers=0;
        numofchoc=remainingwrappers=n/c;
        
           if(remainingwrappers>=m)
            {
               while(remainingwrappers>=m)
                   {
                     numofchoc=numofchoc+(remainingwrappers/m);
                     remainingwrappers=remainingwrappers/m+remainingwrappers%m;
                   }
           }
        printf("%d\n",numofchoc);
    }
 return 0;
}
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
void checkforkaprekar(int i);
int flag=0;
int main() 
{

int lb,hb;
    scanf("%d%d",&lb,&hb);
    for(int i=lb;i<=hb;i++)
        {
            checkforkaprekar(i);
        }
    if(flag==0)printf("INVALID RANGE");
    
    return 0;
}
void checkforkaprekar(int i)
    {
        int numofdigits=0;
        int test=i;
        while(test>0)
            {
                test=test/10;
                numofdigits++;
            }
        long long square=i;
        square=square*square;
        int pow=1;
    while(numofdigits>0){pow=pow*10;numofdigits--;}
        int rhp=square%pow;
        int lhp=square/pow;
    if(rhp+lhp==i){printf("%d ",i);flag=1;}
    }

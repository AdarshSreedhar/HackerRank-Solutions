#include <stdio.h>
int main()
{
    int x1,v1,x2,v2; 
    scanf("%d %d %d %d",&x1,&v1,&x2,&v2);
    if(x1==x2&&v1==v2)
        printf("YES");
    else if((x1>=x2&&v1>=v2)||(x2>=x1&&v2>=v1))
        printf("NO");
    else
    {
       if(x1>x2&&v2>v1)
       {
            while(x2<x1)
            {
                x2+=v2;
                x1+=v1;
            }
            if(x1==x2)printf("YES");
            else printf("NO");
        }
        else if(x1<x2&&v2<v1)
        {
           while(x1<x2)
            {
                x2+=v2;
                x1+=v1;
            }
            if(x1==x2)printf("YES");
            else printf("NO");
        }
        else printf("NO");
    }
    return 0;
}

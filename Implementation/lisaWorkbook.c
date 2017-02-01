#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,k;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    scanf("%d%d",&n,&k);
    int A[n];
    for(int i=0;i<n;i++)scanf("%d",&A[i]);
    int speccount=0;
    int pageno=1;
    for(int j=0;j<n;j++)
        {
            
            int totprobno=1;
            int pgprobno=1;
                for(;;)
                    {
                            while(totprobno<=A[j]&&pgprobno<=k)
                        {
                            if(totprobno==pageno)
                        {
                            speccount++;
                            // break;
                        }
                            totprobno++;
                            pgprobno++;
                        }
                        //3 cases,1 is numofprobs already exhausted.then we might got a special number then number of problens in the page has exceede the limit.
                            if(totprobno>A[j])
                        {
                            pageno++;
                            break;
                        }
                            else if(pgprobno>k)
                        {
                            pageno++;
                            pgprobno=1;
                        }
        
                    }
                
        }
    printf("%d",speccount);
    return 0;
}

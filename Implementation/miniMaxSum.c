#include <stdio.h>
#include <limits.h>
int main()
{
	unsigned int A[5];//the range required here is (0,2^64)
	for(int i=0;i<5;i++)
		scanf("%u",&A[i]);
	
	unsigned int min=UINT_MAX;
	unsigned int max=1;
	for(int i=0;i<5;i++)
	{
		unsigned int sum=0;
		int k=i;
		for(int j=0;j<4;j++)
		{
			sum+=A[k];
			k=(k+1)%5;
		}
        
		if(sum<min)
			min=sum;
		if(sum>max)
			max=sum;
	
    }	
    printf("%u %u\n",min,max);
	return 0;
}
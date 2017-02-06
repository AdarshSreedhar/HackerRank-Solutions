#include <stdio.h>
int findhcf(int A[],int na);
int findlcm(int A[],int na);
int findahcf(int m,int n);
int main()
{
	int na=0,nb=0;
	scanf("%d %d",&na,&nb);
	int A[na],B[nb];
	for(int i=0;i<na;i++)
		scanf("%d",&A[i]);
	for(int i=0;i<nb;i++)scanf("%d",&B[i]);
	int hcf=findhcf(B,nb);
	int lcm=findlcm(A,na);
	int count=0;
	int l=lcm;
	if(lcm==0);
	else
	{
	while(lcm<=hcf)
	{
		if(hcf%lcm==0)count++;
		lcm+=l;
	}
	}
	printf("%d\n",count );
	return 0;
}
	int findlcm(int A[],int na)
	{
		int m=A[0];
		int count=1;
		while(count<na)
		{
			int n=A[count];
			int hcf=findahcf(m,n);
			m=m*n/hcf;
			if(m<0)return 0;
	    	count++;
		}
		return m;
	}

	int findhcf(int A[],int na)
	{
		if(na==1)return A[0];
		else
		{
			int count=1;
			int m=A[0];
			while(count<na)
			{
				//int m=A[count-1];
				int n=A[count];
				while(n!=0)
				{
					int r=m%n;
					m=n;
					n=r;
				}
				if(m==1)return 1;
				count++;
			}	
			return m;
		}
	}
	int findahcf(int m,int n)
		{
			while(n!=0)
			{
				int r=m%n;
				m=n;
				n=r;
			}
			return m;
		}
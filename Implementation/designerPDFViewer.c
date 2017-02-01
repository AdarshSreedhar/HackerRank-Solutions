#include <stdio.h>
int main()
{
	int A[26];
	for(int i=0;i<26;i++)
	scanf("%d",&A[i]);
	char word[10];
	scanf("%s",word);
	int count=0;
	int maxheight=1;
	for(int i=0;word[i]!='\0';i++)
	{
		int h=A[(int)word[i]-97];
		if(maxheight<h)maxheight=h;
		count++;
	}
	printf("%d",count*maxheight);
	return 0;
}
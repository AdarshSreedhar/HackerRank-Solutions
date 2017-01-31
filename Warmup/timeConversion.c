#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
	char in[10];
	char hour[2];
	scanf("%s",in);
	strncpy(hour,in,2);
	int convertedhour=atoi(hour);
	if(in[8]=='A')
	{
		if(convertedhour==12)
		{
			printf("00");
			for(int i=2;i<8;i++)printf("%c",in[i]);		
		}
		else
		{
			for(int i=0;i<8;i++)printf("%c",in[i]);
		}
		
	}
	else if(in[8]=='P')
	{
		if(convertedhour==12)
		{
			for(int i=0;i<8;i++)printf("%c",in[i]);
		}
		else
		{
			convertedhour=(convertedhour+12)%24;
			printf("%d",convertedhour);
			for(int i=2;i<8;i++)printf("%c",in[i]);
		}
		
	}
	return 0;
}
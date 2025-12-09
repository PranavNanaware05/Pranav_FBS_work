#include<stdio.h>
void main()
{
	char str[30];
	printf("enter String=");
	fgets(str,30,stdin);
	int i,count=1;
	for(i=0;str[i]!=0;i++)
	{
		if(str[i]==' ')
		{
			count++;
		}
	}
	printf("total words in String=%d",count);
}
#include<stdio.h>
void main()
{
	char str[50];
	int i,j=0;
	printf("enter String=");
	scanf("%s",str);
	for( i=0;str[i]!='\0';i++)
	{
		if(i%2==0)
		{
			str[j]=str[i];
			j++;
		}
	}
	str[j]='\0';
	printf("after removing elements=%s",str);
}
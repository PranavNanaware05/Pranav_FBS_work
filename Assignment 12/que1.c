#include<stdio.h>
#include<conio.h>
void main()
{
	char str[50],n;
	printf("enter String=");
	scanf("%s",str);
	printf("enter character to search=");
	scanf(" %c",&n);
	char *res=strchr(str,n);
	
	if(res!='\0')
	{
		printf("%c",n);
	}
	else
	{
		printf("Character not found");
	}
}
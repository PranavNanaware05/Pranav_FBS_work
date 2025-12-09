#include<stdio.h>
#include<string.h>
void main()
{
	char str[40];
	printf("enter String 1=");
	scanf("%s",str);
	palindrome(str);
}
void palindrome(char *str)
{
	char org[30];
	strcpy(org,str);
	char* rev=strrev(str);
	printf("\n reversed String=%s",rev);
	if(strcasecmp(org,rev)==0)
	{
		printf("\npalindrome");
	}
	else
	{
		printf("\nnot palindrome");
	}
}
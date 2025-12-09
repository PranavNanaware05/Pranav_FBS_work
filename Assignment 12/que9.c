#include<stdio.h>
#include<string.h>
void main()
{
	char s1[20];
	char s2[20];
	printf("enter String 1=");
	scanf("%s",s1);
	printf("enter String 2=");
	scanf("%s",s2);
	len(s1,s2);
}
void len(char *s1,char *s2)
{
	int i=0,j=0, a,b;
	while(s1[i]!='\0')
	{
		i++;
	}
	
	while(s2[j]!='\0')
	{
		j++;
	}
	if(i>j)
	{
		printf("s1=%s",s1);
	}
	else if(i==j)
	{
		printf("both are same");
	}
	else
	{
		printf("s2=%s",s2);
	}
}
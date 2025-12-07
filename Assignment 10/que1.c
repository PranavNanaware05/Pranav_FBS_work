#include<stdio.h>
#include<string.h>
void main()
{
	char a[20];
	printf("enter String=");
	scanf("%s",a);
	
	int res=strlen(a);
	printf("length of %s is %d",a,res);
}
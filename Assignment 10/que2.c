#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],res[20];
	printf("enter String=");
	scanf("%s",a);
	strcpy(res,a);
	printf("copied String=%s",res);
}
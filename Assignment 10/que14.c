#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[10];
	printf("enter String 1=");
	scanf("%s",a);
	strupr(a);
	printf("uppercase String=%s",a);
}
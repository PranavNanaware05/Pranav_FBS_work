#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[10];
	printf("enter String 1=");
	scanf("%s",a);
	strrev(a);
	printf("reverse String=%s",a);
}
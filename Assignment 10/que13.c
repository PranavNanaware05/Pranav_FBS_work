#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[10];
	printf("enter String 1=");
	scanf("%s",a);
	strlwr(a);
	printf("lowercase String=%s",a);
}
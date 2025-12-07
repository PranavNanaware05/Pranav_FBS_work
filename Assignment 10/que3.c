#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[20];
	printf("enter String =");
	scanf("%s",a);
	strncpy(b,a,3);
	printf("%s",b);
	
}
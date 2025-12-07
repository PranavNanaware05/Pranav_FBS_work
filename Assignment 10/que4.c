#include<stdio.h>
#include<conio.h>
void main()
{
	char a[20],b[20];
	printf("enter String 1=");
	scanf("%s",a);
	printf("enter String 2=");
	scanf("%s",b);
	strcat(a,b);
	printf("string concatation=%s",a);
}
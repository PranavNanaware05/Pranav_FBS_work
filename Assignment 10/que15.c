#include<stdio.h>
#include<string.h>
void main()
{
	char a[40],b[20];
	printf("enter String=");
	fgets(a,40,stdin);
	printf("entered String=%s",a);
	strcpy(b,a);
	printf("\n %s",b);
}
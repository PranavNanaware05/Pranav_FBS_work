#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[20];
	printf("enter String 1 =");
	scanf("%s",a);
    printf("enter String 2 =");
	scanf("%s",b);
	strncat(a,b,3);
	 
	printf("concat String =%s",a);
}
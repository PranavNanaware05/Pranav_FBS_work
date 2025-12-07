#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],n;
	printf("enter String=");
	scanf("%s",a);
	printf("enter character to search=");
	scanf(" %c",&n);
	char * p=strchr(a,n);  //it search from first index
	if(p!=NULL)
	{
		printf("%c is present",n);
	}
	else
	{
		printf("%c is not present",n);
	}
}
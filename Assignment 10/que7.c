#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[20];
	printf("enter String 1=");
	scanf("%s",a);

    printf("enter String 2=");
	scanf("%s",b);	
	
	int res=strncmp(a,b,3);
	
	if(res==0)
	{
		printf("both are same");
	}
	else if(res>0)
	{
		printf( "String 1 is greater");
	}
	else
	{
		printf("string 2 is greater");
	}
}
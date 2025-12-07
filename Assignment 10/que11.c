#include<stdio.h>
#include<string.h>
void main()
{
	char a[20],b[10];
	printf("enter STring 1=");
	scanf("%s",a);
	printf("enter String to Search=");
	scanf("%s",b);
	char *ch=strstr(a,b);
	if(ch!=NULL)
	{
		printf("substring=%s",ch);
	}
	
	else
	{
		printf("Substring isnot present");
	}
}
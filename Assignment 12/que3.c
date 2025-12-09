#include<stdio.h>
void main()
{
	char str[40];
	printf("enter String =");
	scanf("%s",str);
	int n;
	printf("enter index=");
	scanf("%d",&n);
	removeidx(str,n);
}
void removeidx(char *str,int n)
{
	int i=n;
	while(str[i]!='\0')
	{
		
			str[i]=str[i+1];
		
		i++;
	}
	printf("after removed=%s",str);
}
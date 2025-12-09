#include<stdio.h>
void main()
{
	char str[50];
	printf("enter String=");
	scanf("%s",str);
	exchange(str);
}
void exchange(char *str)
{
	int i=0,l=-1;
	while(str[i]!='\0')
	{
	   i++;	
	}
	l=i-1;
	char temp;
	temp=str[0];
	str[0]=str[l];
	str[l]=temp;
	printf("exchanged String=%s",str);
}
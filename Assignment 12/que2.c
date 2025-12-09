#include<stdio.h>
#include<conio.h>
void main()
{
	char str[50];
	printf("enter String=");
	scanf("%s",str);
	replace(str,'$');
}
void replace(char *str,char ch)
{
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]=='a'||str[i]=='A')
		{
			str[i]=ch;
			
		}
		i++;
	}
	printf("replaced String=%s",str);
}
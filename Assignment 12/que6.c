#include<stdio.h>
#include<string.h>
void replace(char *,char ,char );
void main()
{
	char ch[30];
	printf("enter String=");
	fgets(ch,30,stdin);
	
	replace(ch,' ','#');
}
void replace(char *str,char sp,char sym)
{
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==sp)
		{
			str[i]=sym;
		}
		i++;
	}
	printf("%s",str);
}
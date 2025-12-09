#include<stdio.h>
#include<conio.h>
void main()
{
	char a[40];
	printf("enter String 1=");
	scanf("%s",a);
	vowels(a);
}
void vowels(char *str)
{
	int i=0,cnt=0;
	char *s=strlwr(str);
	while(s[i]!='\0')
	{
		if(s[i]=='a' || s[i]=='e' ||s[i]=='i' ||s[i]=='o' ||s[i]=='u')
		{
			cnt++;
		}
		i++;
	}
	printf("total vowels=%d",cnt);
}
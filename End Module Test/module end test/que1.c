#include<stdio.h>
#include<string.h>
void main()
{
	char ch[20];
	printf("enter String=");
   fgets(ch,20,stdin);
   int cnt=1,i=0;
   while(ch[i]!='\0')
   i++;
   for(int j=0;j<i;j++)
   {
   	   
   	   if(ch[j]==' ')
   	   {
   	   	cnt++;
		}
   }
   printf("total words=%d",+cnt);
}
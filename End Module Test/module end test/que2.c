/*wap a pgm to print following series 1+11+111+1111+.....+n times*/
#include<stdio.h>
void main()
{
	int n,cnt=1;
	printf("enter value of n=");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			printf("%d",cnt);
		}
		printf("+");
	}
}
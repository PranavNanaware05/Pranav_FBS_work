/*Check if the array is palindrome or not (using function )*/
#include<stdio.h>
void palindrome(int *a,int n)
{
	int flg=-1;
	for(int i=0;i<n/2;i++)
	{
		if(a[i]!=a[n-1-i])
		{
			flg=0;
			break;
		}
	}
	if(flg==0)
	{
		printf("\n not palindrome");
	}
	else
	{
		printf("palindrome");
	}
}
void main()
{
	int n;
	printf("enter size=");
	scanf("%d",&n);
	int a[n];
	printf("\nenter %d elements=",n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	palindrome(a,n);
}
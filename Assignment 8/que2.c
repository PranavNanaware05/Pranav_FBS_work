#include<stdio.h>
void main()
{
	int n,cnt=-1;
	int a[5];
	printf("enter 5 elements=");
     for(int i=0;i<5;i++)
     {
     	scanf("%d",&a[i]);
	 }
	 printf("enter no to search=");
	 scanf("%d",&n);
	 int i;
	 for( i=0;i<5;i++)
	 {
	 	if(a[i]==n)
	 	{
	 		cnt=a[i];
	 		break;
		 }
	 }
	 if(cnt==a[i])
	 {
	 	printf("Element is present in an array at position %d",i);
	 }
	 else
	 {
	 	printf("element is not present in an array");
	 }
}
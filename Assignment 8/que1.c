#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	int max=a[0];
	int min=a[0];
	for(int i=1;i<5;i++)
	{
		if(max<a[i])     //10 21 34 23 12
		{
			max=a[i];
		}
		if(min>a[i])
		{
			min=a[i];
		}
	}
	printf("\n Max no from Array=%d",max); 
	printf("\n Min no from Array=%d",min);
	
}
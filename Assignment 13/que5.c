#include<stdio.h>
void main()
{
	int len;
	printf("enter length=");
	scanf("%d",&len);
	int *a=(int *)malloc(sizeof(int)*len);
	printf("enter 5 Elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<5;i+=2)
	   {
	   	printf("%d,",a[i]);
	   }
}
#include<stdio.h>
#include<stdlib.h>
void main()
{

   int len;
   printf("enter Length of an array=");
   scanf("%d",&len);
   int *a=malloc(sizeof(int)*len);
   
   printf("enter array elements=");
   for(int i=0;i<len;i++)
   {
   	scanf("%d",&a[i]);
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<len;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	printf("\nmax element=%d",max);
	printf("\nmin element=%d",min);	
}
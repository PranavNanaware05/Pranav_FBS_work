#include<stdio.h>

void exchange(int * arr,int size,int x,int y)
{
	int temp;
	x=x-1;
	y=y-1;
	if(x>0 && x<size && y>0 && y<size)
	{
	
	temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
	
	printf("\nafter exchange");
	for(int i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
   }
   else
   {
   	printf("invalid ");
   }
	
}
void main()
{
	int n,x,y;
	printf("enter size of array=");
	scanf("%d",&n);
	int arr[n];
	printf("enter array elements=");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}

	printf("enter Xth position=");
	scanf("%d",&x);
	printf("enter yth position=");
	scanf("%d",&y);
	exchange(arr,n,x,y);
}
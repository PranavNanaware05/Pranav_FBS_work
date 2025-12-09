#include<stdio.h>
void main()
{
	int len;
	printf("enter len=");
	scanf("%d",&len);
	int *a=(int*)malloc(sizeof(int)*len);
	printf("enter array elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	for(int i=0;i<5;i++)
	{
		int b=a[i];
		int flg=0;
		for(int j=2;j<b;j++)
		{
			if(b%j==0)
			{
				flg=1;
				break;
			}
		}
		if(flg==0)
		{
			printf("%d,",b);
		}
	}
}
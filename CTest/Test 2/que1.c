#include<stdio.h>
void main()
{
	int un,tun;
	printf("enter Units=");
	scanf("%d",&un);
	
	if(un>=1&&un<=50)
	{
		tun=un*30;
		printf("\n Total Bill=%d",tun);
	}
	else if(un>=51&&un<=150)
	{
		tun=un*40;
		printf("\n Total Bill=%d",tun);
	}
	else if(un>=151)
	{
		tun=un*50;
		printf("\n Total Bill=%d",tun);
	}
	else
	{
		printf("\n enter correct units");
	}
	
}
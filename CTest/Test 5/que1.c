#include<stdio.h>
void main()
{
	int p;
	printf("enter price of book=");
	scanf("%d",&p);
	book(p);
}

void book(int p)
{
	int s,d;
    
    if(p>200&&p<400)
    {
    	d=p*10/100;
    	s=p-d;
    	printf("\n discount amount=%d",d);
    	printf("\nselling price=%d",s);
	}
    else if(p>400&&p<600)
    {
    	d=p*15/100;
    	s=p-d;
    	printf("\n discount amount=%d",d);
    	printf("\nselling price=%d",s);
	}
    else if(p>600)
    {
    	d=p*20/100;
    	s=p-d;
    	printf("\n discount amount=%d",d);
    	printf("\nselling price=%d",s);
	}
	else
	{
		printf("enter valid price");
			}		
}
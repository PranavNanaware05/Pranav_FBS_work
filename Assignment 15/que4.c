
/*Point of Sale System: Build a simple point of sale system using structures to
represent products with attributes like name, price, and quantity. Allow users
to add items to a cart and calculate the total cost.*/

#include<stdio.h>
struct product
{
   char pname[20];
   int p;
   int q;	
};

void addproduct(struct product *sarry,int size)
{
	int i;
	for(i=0;i<size;i++)
	{
		printf("enter product=");
		scanf("%s",sarry[i].pname);
		printf("enter product Quantity=");
		scanf("%d",&sarry[i].q);
		printf("enter product price=");
		scanf("%d",&sarry[i].p);
	}
}
void display_bill(struct product *sarry,int size )
{
	int i;
	float amount;
	float total=0;
	for(i=0;i<size;i++)
	{
		amount=sarry[i].p*sarry[i].q;
		total+=amount;
		
		 printf("%s\t%d\t%d\t%.2f\n",sarry[i].pname,sarry[i].q,sarry[i].p, amount);
		
	}
	printf("==========================\n");
	printf("total Bill=%f",total);
}
void main()
{
	
	int n;
	printf("enter no of products=");
	scanf("%d",&n);
    struct 	product sarry[5];
	addproduct(sarry,n);
	display_bill(sarry,n);
}
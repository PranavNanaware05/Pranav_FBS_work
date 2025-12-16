/*Create a structure Book with data members as bname, id, author, price. Accept the
values of all these members from user and display them.*/

#include<stdio.h>
struct book{
	char bname[20];
	int id;
	char author[20];
	int price;
	
	
};
struct book storedata(struct book b1)
{
	printf("enter book name=");
	scanf("%s",b1.bname);
	
	printf("enter book id=");
	scanf("%d",&b1.id);
	
	printf("enter book author=");
	scanf("%s",b1.author);
	
	printf("enter book price=");
	scanf("%d",&b1.price);
	return b1;
}
void display(struct book b1)
{
	printf("book name    =%s\n",b1.bname);
	printf("book id      =%d\n",b1.id);
	printf("book author  =%s\n",b1.author);
	printf(" book price  =%d\n\n",b1.price);

}
void main()
{
	struct book b1;
	b1=storedata(b1);
	display(b1);
}
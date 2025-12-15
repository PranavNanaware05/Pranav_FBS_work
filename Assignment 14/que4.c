#include<stdio.h>
#include<string.h>
struct hr{
	int id;
	char name[20];
	int salary;
	int com;
};
void main()
{
	struct hr e1;
	e1.id=101;
	strcpy(e1.name,"ram");
	e1.salary=1000;
	e1.com=200;
	
	printf("\n Employee Information");
	printf("\n ID=%d",e1.id);
	printf("\n Name=%s",e1.name);
	printf("\n comission=%d",e1.com);
	e1.salary=e1.salary+e1.com;
	printf("\n salary=%d",e1.salary);
}
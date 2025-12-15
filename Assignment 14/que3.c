#include<stdio.h>
#include<string.h>
struct admin{
	int id;
	char name[20];
	int salary;
	int allo;
};
void main()
{
	struct admin e1;
	e1.id=101;
	strcpy(e1.name,"ram");
	e1.salary=1000;
	e1.allo=200;
	
	printf("\n Employee Information");
	printf("\n ID=%d",e1.id);
	printf("\n Name=%s",e1.name);
	printf("\n allowence=%d",e1.allo);
	printf("\n salary=%d",e1.salary);
}
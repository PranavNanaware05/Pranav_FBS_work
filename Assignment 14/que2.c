#include<stdio.h>
#include<string.h>
struct employee{
	int id;
	char name[20];
	int salary;
};
void main()
{
	struct employee e1;
	e1.id=101;
	strcpy(e1.name,"ram");
	e1.salary=1000;
	
	printf("\n Employee Information");
	printf("\n ID=%d",e1.id);
	printf("\n Name=%s",e1.name);
	printf("\n salary=%d",e1.salary);
}
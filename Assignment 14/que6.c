#include<stdio.h>
#include<string.h>
struct date{
	int dt;
	char mon[20];
	int yr;
	
};
void main()
{
	struct date d1;
	d1.dt=15;
	strcpy(d1.mon,"DEC");
	d1.yr=2025;
	
	printf("%d-%s-%d",d1.dt,d1.mon,d1.yr);
}
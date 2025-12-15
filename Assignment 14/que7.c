#include<stdio.h>
#include<string.h>
struct time{
	int h;
	char min;
	int s;
	
};
void main()
{
	struct time d1;
	d1.h=2;
	d1.min=20;
	d1.s=9;
	
	printf("%d:%d:%d",d1.h,d1.min,d1.s);
}
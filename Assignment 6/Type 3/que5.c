#include<stdio.h>
void square_and_cube();
void main()
{
	int no1;
	printf("enter number=");
	scanf("%d",&no1);
	square_and_cube(no1);
}//end of main
void square_and_cube(int x)
{
	int sq,c;
     
    sq=x*x;
    c=x*x*x;
    printf("square of %d is %d",x,sq);
    printf("\ncube of %d is %d",x,c);
}//end of square_and_cube()

int sum();
int average();
int square();
int cube();
void main()
{
	int res=sum() ;
	printf("%d",res);
	
	int avrg= average();
	printf("\naverage=%d",avrg);
	
	int sqr=square();
	printf("\nSquare=%d",sqr);
	
	int cub= cube();
	printf("\nCube=%d",cub);
}//main ends here

 int  sum()
   {
   	int a,b,c;
	a=10;
	b=20;
	c=a+b;
	
	return c;
   }//sum ends here
   
int average()
{
	int a,b,c,d,e,avg,sum;
	a=10;
	b=21;
	c=27;
	d=30;
	e=29;
	sum=a+b+c+d+e;
	avg=sum/5;
	return avg;
}//average end here
int square()
{
	int n,sq;
     n=2;
    sq=n*n;
    return sq;
}//square ends here

int cube()
{
	int n,c;
     n=2;
    c=n*n*n;
    return c;
}//cube ends here

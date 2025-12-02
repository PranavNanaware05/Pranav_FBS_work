#include<stdio.h>
void choice();
void triangle();
void result();
void main()
{
   choice();
   triangle();
   result();
}

void choice()
{
	int a,b,result;
	a=10;
	b=2;
	char ch='*';
	if(ch=='+')
	{
		result=a+b;
		printf("Addition=%d",result);
	}
	else if(ch=='*')
	{
		result=a*b;
		printf("Multiplication=%d",result);
	}
	else if(ch=='-')
	{
		result=a-b;
		printf("Substraction=%d",result);
	}
	else if(ch=='/')
	{
		result=a/b;
		printf("Division=%d",result);
	}
	else if(ch=='%')
	{
		result=a%b;
		printf("Modulus=%d",result);
	}
  else
    {
   	  printf("enter Correct Option");
    }
}
    
    void triangle()
    {
    	int a1,a2,a3;
	a1=45,a2=45,a3=45;
	if((a1==a2)&&(a2==a3))
	{
		printf("\nEquilateral Triangle");
	}
	else if((a1==a2)||(a1==a3)||(a2==a3))
	{
		printf("\nIsosceles Triangle");
	}
	else
	 {
	 	printf("\nScalene Triangle");
	 }
	}
	
	void result()
	{
		int mk=67;
	if(mk>75)
	{
		printf("\nDistinction");
	}
    else if(mk>65)
	{
		printf("\nFirst Class");
	}	
	else if(mk>55)
	{
		printf("\nSecond Class");
	}	
    	
	else if(mk>40)
	{
		printf("Pass Class");
	}	
    else
	{
		printf("Fail");
	}	

	}

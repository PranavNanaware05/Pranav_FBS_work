#include<stdio.h>
void calculator(int ,int ,char);
void main()
{
	int a,b;
	char ch;
	printf("enter two value=");
	scanf("%d%d",&a,&b);
	printf("Enter Operator=");
	scanf(" %c",&ch);
	calculator(a,b,ch);
}

void calculator(int a,int b,char ch)
{
	int result;
	
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
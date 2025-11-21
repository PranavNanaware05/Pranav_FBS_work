void main()
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
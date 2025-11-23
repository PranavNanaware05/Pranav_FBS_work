void main()
{
	int n=145,org=n,sum=0;
	while(n>0)
	{
		int i=1,fact=1,n1;
		n1=n%10;
		while(i<=n1)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		n=n/10;
	}
	
	if(sum=org)
	{
		printf("Strong number");
	}
	else
	{
		printf("not Strong Number");
	}
}
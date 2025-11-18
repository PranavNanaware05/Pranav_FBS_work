void main()
{
	int n=123;
	int q1,q2,q3,a, rev=0;
	q1=n%10;
	a=n/10;
	 
	q2=a%10;
	q3=a/10;
	rev=q1*100+q2*10+q3;
	printf("Reverse No=%d \n",rev);
	if(n==rev)
	{
		printf("no is palindrome");
	}
	else
	{
		printf("no is not palidrome");
	}
}
void main()
{
	int i=1,n=6,sum=0;
	while(i<n)
	{
		if(n%i==0)
		 {
		 	sum=sum+i;
		 }
	   i++;	 
	}
	printf("sum=%d\n",sum);
	
	if(n==sum)
	{
		printf("Perfect no");
	}
	else
	{
		printf("not perfect no");
	}
}
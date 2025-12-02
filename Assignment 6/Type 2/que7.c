int armstrong();
int perfect();
int strong();

void main()
{
	if(armstrong()==1)
	printf("no is Armstrong");
	else
	printf("not Armstrong");
	
	if(perfect()==1)
	printf("\nno is perfect");
	else
	printf("\nno is not perfect");
	
	printf("\n%d",factorial());
	
	if(strong()==1)
	printf("\nstrong number");
	else
	printf("not Strong no");
}
//main ends here

int armstrong()
{
	int rem,sum=0,n=153,cube,og=n;
	while(n>0)
	{
		rem=n%10;
		cube=rem*rem*rem;
		sum=sum+cube;
		n=n/10;
	}
	   
	if(og==sum)
	 {
	 	return 1;
	 }
	 else
	 {
	 	return 0;
	 }
} //Armstrong ends here

int perfect()
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
	printf("\nsum=%d\n",sum);
	
	if(n==sum)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}//perfect ends here

 int factorial()
 {
 	int n=5,fact=1,i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;
 }
 
 int strong()
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
	
	if(sum==org)
	{
	return 1;
	}
	else
	{
		return 0;
	}
 }
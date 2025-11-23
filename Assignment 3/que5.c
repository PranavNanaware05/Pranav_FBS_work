void main()
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
	 	printf(" ArmStrong");
	 }
	 else
	 {
	 	printf("not ArmStrong");
	 }
}
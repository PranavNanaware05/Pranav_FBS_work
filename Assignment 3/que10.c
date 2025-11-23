void main()
{
	int n=1289,rem,sum=0;
	int last,first;
	last=n%10;
	 
	 while(n>=10)
	 {
	 	n=n/10;
	 
	 }
	 printf("\n last=%d",last);
	 printf("\n first=%d",n);
	 sum=last+n;
	 printf("\n sum=%d",sum);
}
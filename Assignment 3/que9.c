void main()
{
	int n=121,rev=0,rem,og=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
    }
    
    if(rev==og)
     {
     	printf("Palindrome");
	 }
	 else
	 {
	 	printf("not Palindrome");
	 }

		
	}

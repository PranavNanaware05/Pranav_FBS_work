void main()
{
	int i=2;
	int n=13,cnt=0;
	while(i<n)
	{
		if(n%i==0)
		{
			cnt=1;
			break;
		}
		i++;
	}
	if(cnt==1)
	{
		printf("not Prime no");
	}
	else
	{
		printf("Prime no");
	}
}
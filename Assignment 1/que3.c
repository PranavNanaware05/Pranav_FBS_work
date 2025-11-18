void main()
{
	int yr=1900;
	if(yr%4==0 && yr%100!=0||yr%400==0)
	{
		printf("Leap Year");
	}
	else
	{
		printf("not Leap year");
	}
}
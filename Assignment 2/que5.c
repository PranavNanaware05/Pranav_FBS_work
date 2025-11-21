/*Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount.*/
void main()
{
	int p=1000,d,bill;
	char std='y';
	if((std=='y'))
   {
     		if(p>500)
	    {
		   d=p*20/100;
		   bill=p-d;
	       printf("Total Bill=%d",bill);
	    }
	    else
	    {
	    	d=p*10/100;
		   bill=p-d;
	       printf("Total Bill=%d",bill);
		}
   }
	else
	{
		if(p>600)
		{
			d=p*15/100;
		   bill=p-d;
	       printf("Total Bill=%d",bill);
		}
		else
		{
			bill=p;
			printf("Total Bill=");
		}
	}
}
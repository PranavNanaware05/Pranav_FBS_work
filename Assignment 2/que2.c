void main()
{
	int a1,a2,a3;
	a1=45,a2=45,a3=45;
	if((a1==a2)&&(a2==a3))
	{
		printf("Equilateral Triangle");
	}
	else if((a1==a2)||(a1==a3)||(a2==a3))
	{
		printf("Isosceles Triangle");
	}
	else
	 {
	 	printf("Scalene Triangle");
	 }
}
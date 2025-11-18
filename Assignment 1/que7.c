void main()
{
	int bs=6000;
	int ta,da,hra,total;
	if(bs<=5000)
	{
		ta=bs*10/100;
		da=bs*20/100;
		hra=bs*25/100;
		total=ta+da+hra+bs;
		printf("ta=%d,da=%d,hra=%d,total=%d",ta,da,hra,total);
	}
	else
	{
		ta=bs*15/100;
		da=bs*25/100;
		hra=bs*30/100;
		total=ta+da+hra+bs;
		printf("ta=%d,da=%d,hra=%d,total=%d",ta,da,hra,total);
	}
}
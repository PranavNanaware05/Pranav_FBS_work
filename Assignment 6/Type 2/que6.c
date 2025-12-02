
int leap();
int vowel();
int Case();

void main()
{
   	if(leap()==1)
   	 printf("leap year");
   	else
   	printf("leap year");
   	
   	if(vowel()==1)
   	printf("\nvowel");
	else
	printf("\nConsonenet");  
	
	if(Case()==1)
	printf("\nuppercase");
	else
	printf("\nlowercase");  
   	
}//main ends here

int leap()
{
	int yr=1900;
	if(yr%4==0 && yr%100!=0||yr%400==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}//leap ends here

int vowel()
{
	char ch='u';
	if( ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}//vowels ends here

int Case()
{
	char ch='a';
	if(ch>='A' && ch<='Z')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}//case ends here
#include<stdio.h>
typedef struct music{
	int sid;
	char t[10];
	char art[20];
	int dur;
} music;
void add(music *sarry,int n)
{
	for(int i=0;i<n;i++)
	{
		printf("\n==================\n");
		printf("enter song ID=");
		scanf("%d",&sarry[i].sid);
		
		printf("enter song Tittle=");
		scanf("%s",sarry[i].t);
		
		printf("enter song artist=");
		scanf("%s",sarry[i].art);
		
		printf("enter song duration=");
		scanf("%d",&sarry[i].dur);
	}
}//add ends here

void display(music *sarry,int n)
{
	for(int i=0;i<n;i++)
	{
		printf("\n==================\n");
		printf("song ID      : %d\n",sarry[i].sid);
		printf("song Tittle  : %s\n",sarry[i].t);
		printf("song artist  : %s\n",sarry[i].art);
		printf("song duration: %d min\n",sarry[i].dur);
		
	}
}
void main()
{
	int n;
	printf("how many songs do you want to add=");
	scanf("%d",&n);
	music sarry[n];
	int ch;
	while(1)
	{
		printf("\n---menu---\n");
		printf("1.add new songs\n2.display songs\n3.exit");
		printf("\nenter your choice=");
		scanf("%d",&ch);
		if(ch==1)
		{
			add(sarry,n);
		}
		else if(ch==2)
		{
			display(sarry,n);
		}
		else if(ch==3)
		{
			char ch;
			printf("\n do you want to exit(y/n)=");
			scanf(" %c",&ch);
			if(ch=='y' || ch=='Y')
			{
				printf("\nexiting program");
				  break;
			}
			
		}
		else
		{
			printf("\n enter correct choice");
		}
	}
}
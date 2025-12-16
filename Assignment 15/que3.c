/*Write a program to create an array for 10 players. For each player store name, no. of
matches played, runs, wickets takes.
a. Create function to Accept the information of each player.
b. Create function to display the information of all the players
c. Display the information of player who made maximum runs and the one who took
maximum number of wickets.*/

#include<stdio.h>
struct cricket{
	char name[20];
	int nom;
	int runs;
	int wk;
};

void storedata( struct cricket *c1,int size)
{
	for(int i=0;i<size;i++)
	{
		
		printf("Enter name= ");
        getchar();                    // clear buffer
        fgets(c1[i].name, 50, stdin);
		printf("enter no of matches played=");
		scanf("%d",&c1[i].nom);
		printf("enter total runs=");
		scanf("%d",&c1[i].runs);
		printf("enter total wickets=");
		scanf("%d",&c1[i].wk);
		
	}
}
void display(struct cricket *c1,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("player %d\n",i+1);
		printf("player name         =%s\n",c1[i].name);
		printf("no of matches played=%d\n",c1[i].nom);
		printf("total runs          =%d\n",c1[i].runs);
		printf("enter total wickets =%d\n",c1[i].wk);
		printf("===================================\n");
	}
}
void max(struct cricket *c1,int size)
{
	int maxrun =0;
	int maxwkt=0;
	int i;
	for(i=0;i<size;i++)
	{
	  if(c1[maxrun].runs<c1[i].runs)
	  {
	  	maxrun=i;
	  }
	  if(c1[maxwkt].wk<c1[i].wk)
	  {
	  	maxwkt=i;
	  }
		
	}
	 printf("\n\nMax Runs Player: %s %d",c1[maxrun].name, c1[maxrun].runs);

    printf("\nMax Wickets Player: %s %d",c1[maxwkt].name, c1[maxwkt].wk);
}
void main()
{
	struct cricket c1[10];
	storedata(c1,10);
	display(c1,10);
	max(c1,10);
}
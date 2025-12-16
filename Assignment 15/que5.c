/*Movie Database: Create a program that uses structures to manage a movie
database with details like title, director, release year, and genre. Allow users
to add, search for, and update movie records.*/
#include<stdio.h>
#include<string.h>
struct movie{
	char title[20];
	char director[20];
	int release_yr;
	char genre[20];
};
void addmovie(struct movie* sarry,int n)
{
	for(int i=0;i<n;i++)
	{
		printf("enter movie title        :");
		scanf("%s",sarry[i].title);
        printf("enter movie director     :");
		scanf("%s",sarry[i].director);
		printf("enter movie Release year :");
		scanf("%d",&sarry[i].release_yr);
		printf("enter movie genre        :");
		scanf("%s",sarry[i].genre);		
	}
}//add movie ends here

void displaymovie(struct movie* sarry,int n)
{
	for(int i=0;i<n;i++)
	{
		printf("movie title   :%s\n",sarry[i].title);
		printf("movie director:%s\n",sarry[i].director);
		printf("Release year  :%d\n",sarry[i].release_yr);
		printf("movie genre   :%s\n",sarry[i].title);
	}
}//display ends here
void searchmovie(struct movie* sarry,int n)
{
	char m[20];
	int found=0;
	printf("enter movie to search=");
	scanf("%s",m);
	for(int i=0;i<n;i++)
	{
		if(strcmp(sarry[i].title,m)==0)
		{
			printf("movie found !\n");
			printf("\nDirector : %s", sarry[i].director);
            printf("\nYear     : %d", sarry[i].release_yr);
            printf("\nGenre    : %s", sarry[i].genre);
            found = 1;
            break;
		}
		if(found==0)
		{
			printf("movie not found");
		}
	}
}//search movie ends here

void updatemovie(struct movie* sarry,int n)
{
	int found=0;
	char m[20];
	printf("enter movie to update=");
	scanf("%s",m);
	for(int i=0;i<n;i++)
	{
		if(strcmp(sarry[i].title,m)==0)
		{	
	    printf("enter new director :");
		scanf("%s",sarry[i].director);
		printf("enter new Release year :");
		scanf("%d",&sarry[i].release_yr);
		printf("enter new genre :");
		scanf("%s",sarry[i].genre);	
			found=1;
		printf("details Updated successfully  !\n");
		}
		
	}
	if(found==0)
		{
			printf("movie not found\n");
		}
}
void main()
{
	int n,c;
	printf("enter no of movies :");
	scanf("%d",&n);
	struct movie sarry[n];
	addmovie(sarry,n);
	while(1)
	{
	
	printf("1.display movies\n2.search movies\n3.update movie\n4.exit\n");
	printf("enter your choice :");
	scanf("%d",&c);
	
	
		if(c==1)
		{
			displaymovie(sarry,n);
		}
		else if(c==2)
		{
			searchmovie(sarry,n);
		}
		else if(c==3)
		{
			updatemovie(sarry,n);
		}
		else if(c==4)
		{
			char ch;
			 printf("Do you want to exit (y/n): ");
            scanf(" %c", &ch);  

            if(ch == 'y' || ch == 'Y')
            {
                printf("Exiting program...\n");
                break;
            }
		}
    }
	
}
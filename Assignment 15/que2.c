/*Create a structure Time with data members as hrs, min, sec. Accept the values of all
these members from user and display them. Also perform addition of two time variables
and display the result. If sec goes beyond 60, carry it to min etc. Add a method to convert
the given time into sec.*/
#include <stdio.h>
struct Time
{
    int hrs;
    int min;
    int sec;
};

/* Function to accept time */
struct Time acceptTime()
{
    struct Time t;
    printf("Enter Hours: ");
    scanf("%d", &t.hrs);
    printf("Enter Minutes: ");
    scanf("%d", &t.min);
    printf("Enter Seconds: ");
    scanf("%d", &t.sec);
    return t;
}

/* Function to display time */
void displayTime(struct Time t)
{
    printf("%d : %d : %d\n", t.hrs, t.min, t.sec);
}

/* Function to add two time values */
struct Time addTime(struct Time t1, struct Time t2)
{
    struct Time t3;

    t3.sec = t1.sec + t2.sec;
    t3.min = t1.min + t2.min;
    t3.hrs = t1.hrs + t2.hrs;

    if (t3.sec >= 60)
    {
        t3.min += t3.sec / 60;
        t3.sec = t3.sec % 60;
    }

    if (t3.min >= 60)
    {
        t3.hrs += t3.min / 60;
        t3.min = t3.min % 60;
    }

    return t3;
}

/* Function to convert time into seconds */
int convertToSeconds(struct Time t)
{
    return (t.hrs * 3600) + (t.min * 60) + t.sec;
}

int main()
{
    struct Time t1, t2, sum;
    int totalSec;

    printf("Enter First Time\n");
    t1 = acceptTime();

    printf("\nEnter Second Time\n");
    t2 = acceptTime();

    printf("\nFirst Time: ");
    displayTime(t1);

    printf("Second Time: ");
    displayTime(t2);

    sum = addTime(t1, t2);
    printf("\nAdded Time: ");
    displayTime(sum);

    totalSec = convertToSeconds(t1);
    printf("\nFirst Time in Seconds = %d\n", totalSec);

    return 0;
}

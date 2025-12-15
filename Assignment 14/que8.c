#include <stdio.h>

struct distance
{
    int feet;
    int inch;
};

void main()
{
    struct distance d1;

    d1.feet = 5;
    d1.inch = 8;

    printf("Distance = %d-%d\n", d1.feet, d1.inch);
}

#include <stdio.h>

struct complex
{
    int real;
    int imag;
};

void main()
{
    struct complex c1;

    c1.real = 4;
    c1.imag = 5;

    printf("Complex Number = %d + %di", c1.real, c1.imag);
}

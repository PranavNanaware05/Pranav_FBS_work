#include <stdio.h>
#include <stdlib.h>

void main()
{
    int n1, n2;

    printf("Enter size of first array = ");
    scanf("%d", &n1);

    printf("Enter size of second array = ");
    scanf("%d", &n2);

    // Allocate memory
    int *a = (int *)malloc(n1 * sizeof(int));
    int *b = (int *)malloc(n2 * sizeof(int));
    int *c = (int *)malloc((n1 + n2) * sizeof(int));

    
    printf("Enter elements of first array:\n");
    for (int i = 0; i < n1; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter elements of second array:\n");
    for (int i = 0; i < n2; i++)
    {
        scanf("%d", &b[i]);
    }

    // Merge arrays
    int k = 0;

    for (int i = 0; i < n1; i++)
    {
        c[k++] = a[i];
    }

    for (int i = 0; i < n2; i++)
    {
        c[k++] = b[i];
    }

    printf("Merged array:\n");
    for (int i = 0; i < n1 + n2; i++)
    {
        printf("%d ", c[i]);
    }

    
}

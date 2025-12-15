#include <stdio.h>
#include <string.h>

struct product
{
    int id;
    char name[20];
    int quantity;
    float price;
};

void main()
{
    struct product p1;
    p1.id = 101;
    strcpy(p1.name, "Pen");
    p1.quantity = 10;
    p1.price = 15.50;
    p1.price=p1.price*p1.quantity;
    printf("Product ID   = %d\n", p1.id);
    printf("Product Name = %s\n", p1.name);
    printf("Quantity     = %d\n", p1.quantity);
    printf("Price        = %.2f\n", p1.price);
}

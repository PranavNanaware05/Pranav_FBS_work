#include <stdio.h>

int main() {
	int n;
	printf("Enter Number: ");
	scanf("%d", &n);

	for(int j = 1; j <= n; j++) {
		int num = j;
		int sum = 0;

		for(int k = num; k > 0; k = k / 10) {
			int no;
			no = k % 10;
			int fact = 1;


			for(int i = 1; i <= no; i++) {
				fact = fact * i;
			}

			sum = sum + fact;
		}

		if(sum == num) {
			printf("%d\n", num);
		}
	}


}

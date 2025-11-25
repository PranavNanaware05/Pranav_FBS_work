#include <stdio.h>
void main() {
	int n;
	printf("Enter number=");
	scanf("%d",&n);
	for(int j=1; j<=n; j++) {
		int no=j,flg=0;
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				flg=1;
				break;
			}
		}
		if(flg==0) {
			printf("\n %d",no);
		}

	}

}
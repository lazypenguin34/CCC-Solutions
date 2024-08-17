#include <stdio.h>
#include <stdlib.h>
int main() {
    int h;
    scanf("%d",&h);

    for (int i=0;i<h;i++) {
        int centreDist = abs(h/2 - i);
        int spaces = centreDist * 4;
        int stars = (2*h - spaces) / 2; // amount on each side

        for (int j=0;j<stars;j++) {
            printf("*");
        }

        for (int j=0;j<spaces;j++) {
            printf(" ");
        }

        for (int j=0;j<stars;j++) {
            printf("*");
        }

        printf("\n");
    }
    return 0;
}
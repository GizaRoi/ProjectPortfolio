// LBYARCH - S11
// MP v2 - Grayscale to Binary
// Roimarc Bilbao (12203394) - Group 7

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#define WIDTH 30
#define HEIGHT 30

extern void cvtGrayToBinary(int img2[][WIDTH], int img1[][WIDTH], int m, int n, int t);

void printIMG(int image[][WIDTH], int r, int c) {
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < c; ++j) {
            printf("%3d ", image[i][j]);
        }
        printf("\n");
    }
}

void printBIN(int image[][WIDTH], int r, int c){
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < c; ++j) {
            if(image[i][j] == 0)
                printf(" . ");
            else
                printf(" @ ");
        }
        printf("\n");
    }
}

int main()
{
    int img1[HEIGHT][WIDTH];
    int img2[HEIGHT][WIDTH];
    int m = WIDTH;
    int n = HEIGHT;
    int t = 100;

    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            img1[i][j] = (i + j) * 10 % 256; //generates grayscale gradient
        }
    }

    printIMG(img1, m, n);
    cvtGrayToBinary(img2, img1, m, n, t);
    printf("\n\n");
    printIMG(img2, m, n);

    printf("row: %d, col: %d", m, n);
    return 0;
}
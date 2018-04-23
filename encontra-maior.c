#include<stdlib.h>
#include<stdio.h>

int max(int a, int b) {
    if (a > b) return a;
    else return b;
}

int encontrar_maior (int *a, int i, int j) {
    if (i == j) {
        return a[i];
    } else {
        return max(encontrar_maior(a, i, j-1), a[j]);
    }
}

int main () {
    int a[6] = {12, 55, 99, 88, 188, 4};

    printf("%d", encontrar_maior(a, 0, 5));
}
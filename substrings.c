#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void substrings(char *str, int i, int j) {
    if (i == j) {
        printf("%c\n", str[i]);
        return;
    }

    substrings(str, i, j-1);
    
    int k;
    for(k=i; k<=j;k++) {
        printf("%c", str[k]);
    }
    printf("\n");
}

void subsub(char *str, int i, int j) {
    if (i > j) return;
    substrings(str, i, j);
    subsub(str, i+1, j);
}

int main () {
    char *str = "UFA";
    subsub(str, 0, strlen(str) - 1);
}
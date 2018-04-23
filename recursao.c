
#include <stdio.h>
#include <stdlib.h>

int fib(int n) {
    printf("fib(%d)\n", n);
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return fib(n-1) + fib(n-2);
    }
}

int main () {
    printf("%d", fib(4));
}
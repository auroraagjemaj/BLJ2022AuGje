/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 26. Oktober 2022, 13:19
 */

#include <stdio.h>
#include <stdlib.h>
int makeUppercase(char *p_c1);
int makeUppercase(char *p_c2);
int makeLowercase(char *p_c1);
int makeLowercase(char *p_c2);

/*
 * 
 */
int main() {
    char c1;
    char c2 = '!';
    printf("write a letter!\n");
    scanf("%c", &c1);

    makeUppercase(&c1);
    makeUppercase(&c2);
    printf("%c%c", c1, c2);

    return 0;
}

int makeUppercase(char *p_c1) {
    if (*p_c1 >= 97 && *p_c1 <= 122) {
        *p_c1 -= 32;
    }
}

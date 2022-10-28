/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 27. Oktober 2022, 09:51
 */

#include <stdio.h>
#include <stdlib.h>

#define HEIGHT 15
#define LENGTH 15

int main(int argc, char** argv) {
    int i = 0;
    int j = 0;
    int userinput;
    int clock [LENGTH][HEIGHT] = {
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

    };
     printf("what time is it?");
    scanf("%d", &userinput);

    if (userinput == 12) {
        clock[7][7] == 1;
                clock[7][6] == 1;
                clock[7][5] == 1;
                clock[7][4] == 1;
                clock[7][3] == 1;
                clock[7][2] == 1;
    }

    printf("Elements of given array: \n");
    for (int i = 0; i < LENGTH; i++) {
        for (int j = 0; j < HEIGHT; ++j) {
            if (clock[i][j] == 0) {
                printf("\t");
            } else {
                printf("%d\t", clock[i][j]);
            }
        }

        printf("\n\n\n\n");
    }

    return (EXIT_SUCCESS);
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 7. Oktober 2022, 20:37
 */

#include <time.h>
#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

/*
 *
 */
int main(int argc, char** argv) {
    srand(time(NULL));
    int x = 0;
    int y = 0;
    int on = 1;
    int lightsout[SIZE][SIZE] = {
        {}
    };



    for (int x = 0; x < SIZE; x++) {
        for (int y = 0; y < SIZE; y++) {
            lightsout[x][y] = rand() % 2;
        }
    }

    do {



        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                printf("|%d", lightsout[x][y]);
            }
            printf("|\n");
        }



        printf("select row:\n");
        scanf(" %d", &x);
        printf("-----------\n");
        printf("select column:\n");
        scanf(" %d", &y);




        if (lightsout[x][y] == 0) {
            lightsout[x][y] = 1;
        } else if (lightsout[x][y] == 1) {
            lightsout[x][y] = 0;
        }
        if (lightsout[x - 1][y] == 0) {
            lightsout[x - 1][y] = 1;
        } else if (lightsout[x - 1][y] == 1) {
            lightsout[x - 1][y] = 0;
        }
        if (lightsout[x][y - 1] == 0) {
            lightsout[x][y - 1] = 1;
        } else if (lightsout[x][y - 1] == 1) {
            lightsout[x][y - 1] = 0;
        }
        if (lightsout[x + 1][y] == 0) {
            lightsout[x + 1][y] = 1;
        } else if (lightsout[x + 1][y] == 1) {
            lightsout[x + 1][y] = 0;
        }
        if (lightsout[x][y + 1] == 0) {
            lightsout[x][y + 1] = 1;
        } else if (lightsout[x][y + 1] == 1) {
            lightsout[x][y + 1] = 0;
        }



    } while (on == 1);




    return (EXIT_SUCCESS);
}

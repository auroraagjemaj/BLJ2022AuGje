/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 5. Oktober 2022, 13:23
 */

#include <stdio.h>
#include "calculator.h"


int main() {
    
    printf("-------------------------------");
    printf("\nWillkommen zum Super-Rechner!\n");
    printf("-------------------------------");
            
    printf( "\nDie Quadratwurzel von 32 wurde berechnet: "
            "\ndas Ergebnis lautet %d\n", calcPow(32,2));
    printf("-------------------------------");
    
    printf("\nDie Quadratwurzel von 225 wurde berechnet: "
            "\ndas Ergebnis lautet %d. \n", squareRoot(225));
    printf("-------------------------------");
     
    return 0;
}

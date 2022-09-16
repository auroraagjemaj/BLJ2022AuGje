/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 16. September 2022, 10:33
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
/*
 * 
 */
int main(int argc, char** argv) {
   
    srand(time(NULL));
    int randomNum = rand()% 20 + 1; 
    int guessedNum =0;
    int attempts= 5;
       
    printf("---------------------------\n");
    printf("Welcome to the number guessing game!\n");
    printf("---------------------------\n");
    printf("Guess the number > ");
    while (randomNum != guessedNum &&attempts > 0) {
        
        scanf("%d", &guessedNum );
        if (randomNum == guessedNum) {
            printf("Congratulations! You guessed my number!");
            break;
        }else if(attempts == 1){
            printf("You lose :( my number was %d", randomNum);
        }else if(randomNum < guessedNum){
            printf("no, it is lower\n");
            printf("Attempts left: %d\n", attempts);
            printf("Guess the number > ");
            attempts--;
        }else if (randomNum > guessedNum){
            printf("no, it is higher\n");
            printf("Attempts left: %d\n", attempts);       
            printf("Guess the number > ");
           attempts--; 
        } 
        }
        
       
        
        }

         
    
    


/* 
 * File:   main.c
 * Author: Aurora
 *
 * Created on 29. September 2022, 10:29
 */

#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5

/* 
 * File:   main.c
 * Author: surber
 *
 * Created on 7. September 2022, 10:29
 */

#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5

int main(int argc, char** argv) {

    int i;
    float mark[5], sum=0, average;
   
   
    printf("-----------------------\n");
    printf("Average Mark Calculator\n");
    printf("-----------------------\n");
    
    
    printf("what are your grades?/n");
    for(i=0; i<5; i++)
    {
        scanf("%f", &mark);
    }
      sum = mark[5];
      
    average = sum/5;
    printf("\nAverage Mark = %0.2f", average);

    return 0;
}
    
    
    
    
    
 




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


int calcPow(int base, int exp){
    
    if(exp == 0){ return 1; }
    
    int result = base;
    
    while(exp > 1){
        
        exp--;
        result = result * base;
    }
    
    return result;
}

int squareRoot(int sqaure){
    
    int c = 2;
    while(c > 1){
        if(c * c == sqaure){
        break;
        
        c += 2;     
        c++;
    }
    
    return c;
}
}
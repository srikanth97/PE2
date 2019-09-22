package com.stackroute;

import java.util.Scanner;

public class Factorial {
    public int factorial(int num) {
        if(num<0)
            return -1;
        if(num == 0) {
            return 1;
        }
        return (num*factorial(num-1));
    }

    public long longFactorial(int num){
        long factorial = 1;
        for(int i=1;i<=num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}

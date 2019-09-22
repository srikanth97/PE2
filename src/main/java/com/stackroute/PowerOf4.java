package com.stackroute;

public class PowerOf4 {
    public boolean power4(int num){
        if(num <= 1){
            return false;
        }
        while(num > 1){
            if(num % 4 == 0){
                num = num/4;
            }else {
                return false;
            }
        }
        return true;
    }
}

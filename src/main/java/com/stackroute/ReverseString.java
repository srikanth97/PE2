package com.stackroute;

public class ReverseString {
    public boolean reverse(String str){
        if(str == ""){
            return false;
        }
        str = str.toLowerCase().replaceAll(" ","");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            return true;
        }
        return false;
    }
}

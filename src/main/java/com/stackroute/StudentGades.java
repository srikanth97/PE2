package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class StudentGades {
    public float average(int[] grades){
        int sum = 0;
        for(int i=0 ;i<grades.length;i++){
            sum = sum + grades[i];
        }
        return (sum/grades.length);
    }

    public int max(int[] grades){
        int max=0;
        for(int i=0;i<grades.length;i++){
            if(grades[i] > max){
                max = grades[i];
            }
        }
        return max;
    }

    public int min(int[] grades){
        int min=100;
        for(int i=0;i<grades.length;i++){
            if(grades[i] < min){
                min = grades[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        StudentGades sg = new StudentGades();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of Students:-");
        int students = in.nextInt();
        int[] grades  = new int[students];
        int temp;
        for(int i =0;i< students;i++){
            boolean check = false;
            System.out.printf("Enter the grade for student %d : ",i+1);
            temp = in.nextInt();
            do{
                if(temp > 0 && temp < 100){
                    grades[i] = temp;
                    check = true;
                }else{
                    System.out.printf("Enter the correct grades for student %d : ",i+1);
                    temp = in.nextInt();
                }
            }while (!check);
        }
        System.out.printf("The average is %.2f \n",sg.average(grades));
        System.out.printf("THe Maximum is %d \n",sg.max(grades));
        System.out.printf("THe minimum is %d",sg.min(grades));
    }
}

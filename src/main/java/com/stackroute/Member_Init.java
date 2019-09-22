package com.stackroute;

import java.util.Scanner;

public class Member_Init {
    public static void main(String[] args) {
        Member mb = new Member();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Member Name:");
        mb.setName(sc.next());
        System.out.println("Enter Age");
        mb.setAge(sc.nextInt());
        System.out.println("Enter Salary");
        mb.setSalary(sc.nextFloat());
        System.out.println(mb.toString());
    }

}

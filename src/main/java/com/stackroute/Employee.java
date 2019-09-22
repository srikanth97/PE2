package com.stackroute;

public class Employee {
    public static void main(String[] args) {
        EmployeeClass ec = new EmployeeClass();
        ec.setFirstName("Srikanth");
        ec.setLastname("Nandikonda");
        ec.setAge(22);
        ec.setSalary(48000);
        System.out.println("Employee age is valid or not? " + ec.isValidAge());
        System.out.println("Employee full name :- " + ec.fullName());
    }
}

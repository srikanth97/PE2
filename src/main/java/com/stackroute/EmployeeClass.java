package com.stackroute;

public class EmployeeClass {
    private String firstName;
    private String lastname;
    private int age;
    private float salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 101 && age > 0)
            this.age = age;
        else{
           System.out.println("Enter valid age.");

        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isValidAge(){
        if(this.age >17 && this.age <100){
            return true;
        }
        return false;
    }

    public String fullName(){
        return this.firstName + " "+ this.lastname;
    }


}

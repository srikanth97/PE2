package com.stackroute;

public class Member {
    private String name;
    private int age;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age =age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return  "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

package Interfaces;

import java.awt.*;
import java.util.Arrays;
import java.util.Timer;

public class Employee implements Person{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void showName() {
        System.out.println(name);
    }

    @Override
    public void showAge() {
        System.out.println(age);
    }

    @Override
    public void showSalary() {
        System.out.println(salary);
    }



    public static void main(String[] args) {
        Employee worker=new Employee("Mark",24,4500);
        worker.showAge();
        worker.showName();
        worker.showSalary();
        worker.show();


        Runnable run = () -> {
            for (int i = 0; i < 10; i++) System.out.println(i);
        };





    }
}

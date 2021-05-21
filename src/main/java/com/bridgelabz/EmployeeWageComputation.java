package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage computation");
        int Present = 1;
        double checkEmp =Math.floor(Math.random() * 10) % 2;
        if (checkEmp==Present){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}

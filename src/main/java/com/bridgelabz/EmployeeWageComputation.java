package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage computation");
        int Present = 1;
        int ratePerHr = 20;
        int empHr , dailyWage;

        double checkEmp =Math.floor(Math.random() * 10) % 2;
        if (checkEmp==Present){
             empHr=8;
             dailyWage = empHr * ratePerHr;
            System.out.println("Employee is Present"+"\n daily Wage is "+dailyWage +"rs");
        }
        else {
            System.out.println("Employee is Absent"+"\n And hence daily Wage is 0 rs ");
        }

    }
}

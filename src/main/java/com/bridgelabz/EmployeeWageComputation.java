package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage computation");

        int maxWorkingDays=0;
        int ratePerHr = 20;
        int totalHr =0;
        int empHr = 0, dailyWage;

        while (maxWorkingDays<=20 && totalHr<=100) {
            double checkEmp = Math.floor(Math.random() * 10) % 3;
            int c = (int) checkEmp;

            switch (c) {
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;
                    break;
            }
            totalHr = totalHr + empHr;
        }
         dailyWage = empHr * ratePerHr;
         System.out.println("daily Wage =" + dailyWage);


    }
}

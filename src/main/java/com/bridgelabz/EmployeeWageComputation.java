package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage computation");

        int maxWorkingDays=20;
        int ratePerHr = 20;
        int totalHr =0;
        int empHr = 0, dailyWage;

        for (int i=0; i<=maxWorkingDays; i++) {
            double checkEmp = Math.floor(Math.random() * 10) % 3;
            int c = (int) checkEmp;

            switch (c) {
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
                case 3:
                    empHr = 0;
                    break;
            }
            totalHr = totalHr + empHr;
        }
         dailyWage = empHr * ratePerHr;
         System.out.println("daily Wage =" + dailyWage);


    }
}

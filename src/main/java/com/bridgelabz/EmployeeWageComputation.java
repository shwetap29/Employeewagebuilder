package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage computation");

        int ratePerHr = 20;
        int empHr = 0, dailyWage;

        double checkEmp =Math.floor(Math.random() * 10) % 3;
         int c = (int) checkEmp;

         switch (c) {
         case 1 :
               empHr=8;
               System.out.println("Employee is Present");
               break;
          case 2 :
               empHr=4;
              System.out.println("Employee is Part Time");
              break;
          case 3 :
                 empHr=0;
              System.out.println("Employee is Absent");
              break;
         }

       // if (checkEmp==Present){
       //      empHr=8;
       //      dailyWage = empHr * ratePerHr;
       //     System.out.println("Employee is Present"+"\n daily Wage is "+dailyWage +"rs");
       // }
       // else if (checkEmp==PartTime){
       //     empHr=4;
       //     dailyWage = empHr * ratePerHr;
       //     System.out.println("Part Time Employee's Wage = " + dailyWage);
       // }
       // else {
       //     System.out.println("Employee is Absent"+"\n And hence daily Wage is 0 rs ");
       // }
         dailyWage = empHr * ratePerHr;
         System.out.println("daily Wage =" + dailyWage);


    }
}

package JAVA.Practice.ASS2;

import java.util.*;

public class Prob_3 { /*Enter the basic salary of an employee of an organization through the keyboard. 
    His dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic salary.
     Write a java program to calculate his gross salary. Print the DA, HRA and Gross salary.*/
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the basic salary :- ");
        int BA = sc.nextInt();
        double DA = BA * 0.4;
        double HRA = BA * 0.2;
        double Gross = BA + DA + HRA;
        System.out.println("DA is " + DA + "\nHRA is " + HRA + "\nGross salary is " + Gross);
    }
}
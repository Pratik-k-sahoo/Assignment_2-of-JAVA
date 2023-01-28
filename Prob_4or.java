package JAVA.Practice.ASS2;

import java.util.*;

public class Prob_4or {  /*Write a java program that reads an integer
    between 0 and 1000 and adds all the digits in the integer. For example, 
    if an integer is 749, the sum of all its digits is 20*/
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 0-1000 :- ");
        int num = sc.nextInt();
        int sum, remainder;
        int fidgt, sedgt, thdgt, fodgt;
        fidgt = num % 10;
        remainder = num / 10;
        sedgt = remainder % 10;
        remainder = remainder / 10;
        thdgt = remainder % 10;
        remainder = remainder / 10;
        fodgt = remainder % 10;
        sum = fidgt + sedgt + thdgt + fodgt;
        System.out.println("Sum of all digits in " + num + " is " + sum);

    }
}

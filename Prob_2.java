package JAVA.Practice.ASS2;

import java.util.*;

public class Prob_2 { /*The distance between two cities (in km.) is input through the keyboard. 
    Write a java program to convert and print this distance in meters, feet, inches and centimetres.*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance between two cities in k.m. :- ");
        int Dis = sc.nextInt();
        int metre = Dis * 1000;
        double feet = Dis * 3280.8399;
        double inch = Dis * 39370.0787;
        int cm = Dis * 100000;
        System.out.println(Dis + " k.m. in meter is " + metre + " m");
        System.out.println(Dis + " k.m. in feet is " + feet + " ft");
        System.out.println(Dis + " k.m. in inch is " + inch + " inch");
        System.out.println(Dis + " k.m. in centimetre is " + cm + " cm");

    }
}

package JAVA.Practice.ASS2;

import java.util.*;
public class Prob_6 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of seconds: ");
        double T = sc.nextDouble();
        double D = (1.0/2) * 32.174 * T * T;
        System.out.println("Distance travelled: " + D);
    }
}

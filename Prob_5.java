package JAVA.Practice.ASS2;

import java.util.*;
public class Prob_5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of hemisphere: ");
        double R = sc.nextDouble();
        double S = 3 * Math.PI * R * R;
        double V = (2.0/3) * Math.PI * R * R * R;
        System.out.println("The surface area of the hemisphere is " + S + "\nThe volume area of the hemisphere is " + V);
    }
    
}

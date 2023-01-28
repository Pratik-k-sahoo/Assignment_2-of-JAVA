package JAVA.Practice.ASS2;

import java.util.*;

public class Prob_1 { /*Write a java program that reads a Fahrenheit degree in a double value 
    from the console, then converts it to Celsius and displays the result. 
    The formula for the conversion is as follows:*/
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit :- ");
        double far = sc.nextDouble();
        double cel;
        cel = (far - 32) * (5.0/9);
        System.out.println(far + " Fahrenheit in celsius is " + cel + " Celsius");
        
    }
}

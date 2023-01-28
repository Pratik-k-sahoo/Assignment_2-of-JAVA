package JAVA.Practice.ASS2;



public class Prob_4 {/*Write a java program that reads an integer
    between 0 and 1000 and adds all the digits in the integer. For example, 
    if an integer is 749, the sum of all its digits is 20*/
    public static void main(String args[]){

        int a = 502;
        int sum = 0;
        while(a!=0){
            sum = sum + a % 10;
            a = a / 10;
        }
        
        System.out.println("sum is " + sum);
        
    }
}

package JAVA.Practice.ASS2;

public class Prob_7 {
    public static void main (String args[]){
        int a = 1, b = 2;
        System.out.println(" a      b      pow(a,b)");
        System.out.println("---    ---     --------");
        System.out.println(" " + a + "      " + b + "      " + "  " + (int)Math.pow(a,b));
        System.out.println(" " + ++a + "      " + ++b + "      " + "  " + (int)Math.pow(a,b));
        System.out.println(" " + ++a + "      " + ++b + "      " + "  " + (int)Math.pow(a,b));
        System.out.println(" " + ++a + "      " + ++b + "      " + "  " + (int)Math.pow(a,b));
        System.out.println(" " + ++a + "      " + ++b + "      " + "  " + (int)Math.pow(a,b));
    }
}
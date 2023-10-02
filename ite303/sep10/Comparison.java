package sep10;

import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x == y);

        if(x==y){
            System.out.println("Equal!");
        } 

        // if you put ; after if, it will be the body of the if
        // just like if() {};

        // System.out.println( 2 + 5 / 2);  PMDAS but % comes after Division

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double quotient = (double)num1 / num2;
        System.out.println(quotient);

        // if its 3/2 it will give 1 and not 1.5 thats because of
        // something called (Truncation, it means like cutting) 
        // which cuts whatever is after the period
        // now made the int into double and still we didn't couldnt get
        // the right answer

        // an elegant solution would be Casting, like (double)int, it
        // will be a double instead of an int

        // int / int => int
        // int / double => double
        // double / int => double
        // double / double => double
    }
}
package sep26;
import java.util.Scanner;

public class lab3_HaniAmer{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a binary number: ");
    
        long userInput = input.nextLong();
        long bin = userInput; // in here since its a primitive data type, we are just creating a copy and not modifying the original
        long dec = 0;
        int multiple = 1;
        
        /*
         * to know if a loop is counter or sentinel controlled, we have to check
         * if we know how much the loop will run before it reaches the loop
         * condition, if we do know, then its a counter controlled loop
         * otherwise it is a sentinel controlled loop
         */


         // normal numbers by default are int or double depending on their size

        while(bin > 0) { // this is counter controlled repition loop
            long rightDig = bin % 10; // get the digit on the right
            dec = dec + (rightDig * multiple); // the formula
            multiple = multiple * 2;
            bin = bin / 10; // delete the digit on the right
        }
        System.out.printf("%d = %d", userInput, dec);
    }
}
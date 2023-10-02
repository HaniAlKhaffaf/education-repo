package sep28;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a binary number: ");
    int num = input.nextInt();
      long result = 1;
      int counter = 1;
      while(counter <= num) {
        result = result * counter;
        counter ++;
      }  
      System.out.println(result);
    }
}
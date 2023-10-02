package sep28;

import java.util.Scanner;

public class E{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a number: ");
    int num = input.nextInt();
    double factorial = 1;
    int counter = 1;
    while(counter <= num) {
      factorial += 1 / (factorial * counter);
    } 
    System.out.println(factorial);
  }
}
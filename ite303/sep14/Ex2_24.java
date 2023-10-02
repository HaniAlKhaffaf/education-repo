package sep14;
import java.util.Scanner;

public class Ex2_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int largest = num1;
        if(num2 > largest) largest = num2;
        if(num3 > largest) largest = num3;
        if(num4 > largest) largest = num4;
        if(num5 > largest) largest = num5;

        int smallest = num1;
        if(num2 < smallest) smallest = num2;
        if(num3 < smallest) smallest = num3;
        if(num4 < smallest) smallest = num4;
        if(num5 < smallest) smallest = num5;

        System.out.printf("The smallest number is %d and the largest number is %d", smallest, largest );

        
    }
}
package oct24;

import java.util.Scanner;

public class Lab4_HaniAmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please input the second number: ");
        int num2 = input.nextInt();
        int result = multiply(num1, num2);
        System.out.printf("%d * %d = %d", num1, num2, result);
    }

    public static int multiply(int num1, int num2) {
        int multiple = 0;
        for (int i = 1; i <= num2; i++) {
            multiple = multiple + num1;
        }
        return multiple;
    }
}
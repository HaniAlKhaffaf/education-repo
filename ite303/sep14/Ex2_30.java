package sep14;
import java.util.Scanner;

public class Ex2_30 {



    // any number % 10 will give you the rightmost digit
    // any number / 10 will give you the full number without the rightmost digit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        int num1 = userInput % 10 ; // books calls it "Pick off the rightmost digit"
        userInput /= 10;            // delete the rightmost digit
        int num2 = userInput % 10;
        userInput /= 10;
        int num3 = userInput % 10;
        userInput /= 10;
        int num4 = userInput % 10;
        int num5 = userInput /= 10;

        System.out.printf("%d %d %d %d %d", num1, num2, num3, num4, num5);



    }
}
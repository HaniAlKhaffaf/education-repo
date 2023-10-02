package sep14;
import java.util.Scanner;

public class Ex2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 % num2 == 0) {
            System.out.printf("%d is a mutliple of %d ", num1, num2);
        } else {
            System.out.printf("%d is not a mutliple of %d ", num1, num2);
        }

    }
}

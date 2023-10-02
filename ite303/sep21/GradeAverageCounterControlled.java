package sep21;
import java.util.Scanner;

public class GradeAverageCounterControlled{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 5) {
            System.out.println("Enter a grade");
            int grade = input.nextInt();
            sum = sum + grade;
            counter++;
        }
        System.out.printf("The average of the %d students is: %d", counter, sum/counter);
    }
}
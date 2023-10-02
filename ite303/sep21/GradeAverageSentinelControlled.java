package sep21;

import java.util.Scanner;

public class GradeAverageSentinelControlled {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int grade = input.nextInt();
        int counter = 0;

        while (grade != -1) {

            total = total + grade;
            counter++;

            System.out.println("Enter a grade");
            grade = input.nextInt();;

        }
        if(counter != 0) {
            System.out.printf("The average of the %d students is: %d", counter, total/counter );
        } else {System.out.println("No grades were input");}
     
    }
}

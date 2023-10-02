package sep19;
import java.util.Scanner;

public class Lab2_HaniAmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers you want to print? : ");
        int inputNumber = input.nextInt();

        System.out.print("Enter an integer: ");
        int largest = input.nextInt();
        int smallest = largest;

        int counter = 0;
        while(counter < inputNumber - 1) {
            System.out.print("Enter an inter : ");
            int num = input.nextInt();
            if (num > largest) {
                largest = num;
            } else if(num < smallest) {
                    smallest = num;
                    }

            counter = counter + 1;
        }

        System.out.printf("The largest number is %d and the smallest number is %d", largest, smallest);
    }
}
package project;

import java.security.SecureRandom;
import java.util.Scanner;

public class Project_HaniAmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean againBoolean = true;

        System.out.println("This application is for students who want to practice on mathematical operations");

        // loop to control when user ends
        while (againBoolean) {
            System.out.println("Please select a mathematical operation: ");
            System.out.print("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Modulus \n");

            System.out.print("Operation code: ");
            int operationNumber = input.nextInt();
            // switch to control operations
            switch (operationNumber) {
                case 1:
                    operation(input, "+");
                    break;
                case 2:
                    operation(input, "-");
                    break;
                case 3:
                    operation(input, "*");
                    break;
                case 4:
                    operation(input, "/");
                    break;
                default:
                    operation(input, "%");
                    break;
            }

            // code for setting the boolean after each iteration
            System.out.print("Another problem? (1- yes, 2- no): ");
            int againInt = input.nextInt();
            if (againInt == 1)
                againBoolean = true;
            else {
                againBoolean = false;
                System.out.println("Bye");
            }
        }
    }

    // method to generate a random value given the max digits number
    private static int generateRandomNumber(Scanner input) {
        int numberOfDigits = input.nextInt();
        if (numberOfDigits > 10) {
            numberOfDigits = 10;
        }
        SecureRandom random = new SecureRandom();
        int min = (int) Math.pow(10, numberOfDigits - 1);
        int max = (int) Math.pow(10, numberOfDigits) - 1;
        return min + random.nextInt(max - min + 1);
    }

    // method for all operation and specified by the sign
    public static void operation(Scanner input, String sign) {
        System.out.print("Maximum digits of the first random integer? ");
        int firstNum = generateRandomNumber(input);
        System.out.print("Maximum digits of the second random integer? ");
        int secondNum = generateRandomNumber(input);

        // condition to check whether mod and division has zero as a second value
        if (sign == "/" || sign == "%") {
            while (secondNum == 0) {
                secondNum = generateRandomNumber(input);
            }
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = ? ");
        System.out.print("Answer: ");
        int answer = input.nextInt();
        // if conditions to decide which operation to execute depending on the sign we
        // gave
        int result;
        if (sign == "+")
            result = firstNum + secondNum;
        else if (sign == "-")
            result = firstNum - secondNum;
        else if (sign == "*")
            result = firstNum * secondNum;
        else if (sign == "/")
            result = firstNum / secondNum;
        else
            result = firstNum % secondNum;

        while (answer != result) {
            System.out.println("Try again...");
            System.out.print("Answer: ");
            answer = input.nextInt();
        }
        System.out.println("Correct");
    }

}

package nov9;

import java.util.Scanner;

public class Lab6_HaniAmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] inv = new int[3][4];
        System.out.println("Enter item type(1 - 3) (-1 to stop): ");
        int type = input.nextInt();
        while (type != -1) {

            System.out.println("Enter item size (1-4): ");
            int size = input.nextInt();
            if (type > 0 && type < 4 && size > 0 && size < 5)
                inv[type - 1][size - 1]++;
            else
                System.out.println("Invalid input!");

            System.out.println("Enter item type(1 - 3) (-1 to stop): ");
            type = input.nextInt();
        }

        printArray(inv);

    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int el : row) {
                System.out.printf("%4d ", el);
            }
            System.out.println();
        }
    }

}
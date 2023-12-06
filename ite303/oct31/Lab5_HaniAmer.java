package oct31;

import java.security.SecureRandom;
import java.util.Scanner;

public class Lab5_HaniAmer {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int faceExcluded;
        do {
            System.out.println("Enter the face to be excluded: ");
            faceExcluded = input.nextInt();
        } while (faceExcluded < 1 || faceExcluded > 6);

        int face;
        do {
            face = sr.nextInt(6) + 1;
        } while (face == faceExcluded);

        System.out.printf("The face is %d", face);

    }
}

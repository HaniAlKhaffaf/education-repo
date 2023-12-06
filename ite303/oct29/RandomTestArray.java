package oct29;

import java.security.SecureRandom;

public class RandomTestArray {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        int[] arr = new int[6];

        for (int i = 0; i <= 60000; i++) {
            int face = sr.nextInt(6) + 1;
            arr[face - 1]++;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /* ------------------------------------------------ */
        // in the method below, we create an extra slot in the array so that
        // our code will be more clean by avoiding the face - 1 or face + 1

        int[] arr2 = new int[7];

        for (int i = 1; i <= 60000; i++) {
            int face2 = sr.nextInt(6) + 1;
            arr2[face2]++;
        }
        for (int face2 = 1; face2 < arr2.length; face2++) {
            System.out.printf("%d\t%d%n", face2, arr2[face2]);
        }
    }
}

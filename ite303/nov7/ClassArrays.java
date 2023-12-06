package nov7;

import java.util.Arrays;

public class ClassArrays {

    // Sort --> Arrays.sort()
    // Fill --> Arrays.fill()
    // Copy --> System.arraycopy()
    public static void main(String[] args) {
        double[] arr = { 4.5, 7.8, 1.2, 3.7, 8.3 };
        Arrays.sort(arr);
        printArray(arr);

        double[] arrToBeFilled = new double[6]; // 6 elements
        Arrays.fill(arrToBeFilled, 5.3);
        printArray(arrToBeFilled);

        // understand the arguemnts of the arraycopy
        double[] arrCopy = new double[5];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        printArray(arrCopy);
    }

    public static void printArray(double[] arr) {
        for (double el : arr) {
            System.out.printf("%.1f ", el);
        }
        System.out.println();
    }
}

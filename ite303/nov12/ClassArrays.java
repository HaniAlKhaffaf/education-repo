package nov12;

// this class is continuation of class on nov7
import java.util.Arrays;

public class ClassArrays {

    // sort --> Arrays.sort()
    // fill --> Arrays.fill()
    // copy --> System.arraycopy()
    // equals --> Arrays.equals()
    // Arrays.binarySearch();

    public static void main(String[] args) {
        double[] arr = { 4.5, 7.8, 1.2, 3.7, 8.3 };

        /* SORT */
        Arrays.sort(arr);
        printArray(arr);

        /* FILL */
        double[] arrToBeFilled = new double[6]; // 6 elements
        Arrays.fill(arrToBeFilled, 5.3);
        printArray(arrToBeFilled);

        /* ARRAY COPY */
        // understand the arguemnts of the arraycopy
        double[] arrCopy = new double[5];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        printArray(arrCopy);

        /* EQUALS */
        boolean isCopy = Arrays.equals(arr, arrCopy);
        System.out.println(isCopy);

        /* BINARY SEARCH */
        // array must already be sorted -- If negative number, couldnt find it
        int index = Arrays.binarySearch(arr, 7.8);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 99.6);
        System.out.println(index);
    }

    public static void printArray(double[] arr) {
        for (double el : arr) {
            System.out.printf("%.1f ", el);
        }
        System.out.println();
    }
}

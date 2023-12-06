package oct26;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5]; // we use this way of array in case we have a regular relationship
        int[] arr2 = { 1, 2, 3, 4 }; // array initializer or initializer list..
        int[] arr3 = new int[30];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = 2 * i + 2;
            sum += arr3[i];
        }
        System.out.println(sum);

        // One important note, is that whatever you want to print in the array,
        // then we want to have our array go through X - 1 so we can reach it

        /*
         * Two different types of data in java
         * 1- Primitve type --> int x = 10
         * 2- refrence type --> int[] arr = new int [5]
         */
    }
}

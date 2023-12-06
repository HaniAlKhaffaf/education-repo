package nov5;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int[][] arr2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12, 13 }
        };
        int[][] arr3 = new int[3][4]; // will be filled by zeros by default
        int[][] arr4 = new int[3][]; // we are using this array to create an irregular strucutre
                                     // like the one in arr2
        arr4[0] = new int[4];
        arr4[1] = new int[4];
        arr4[2] = new int[5];

        // this code below will only work so far, if all of our arr[0] are the same
        // then we face no problem, but we will have to modify this to improve our code
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // below will be the code to adjust the problem we discussed above
        // the code below will be working on any type of arrays
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        printArray(arr);
        printArray(arr3);
        printArray(arr4);
    }

    // we are going to create a method that will print the arrays, we dont need
    // to write more loops to print the array, this method will suffice
    public static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

    public static void enhancedPrintArray(int[][] arr) {
        for (int[] row : arr) {
            for (int el : row) {
                System.out.printf("%4d ", el);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

}

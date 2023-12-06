package nov7;

public class DynamicArrayMethod {
    public static void main(String[] args) {
        average(2, 3);
        average(2, 5, 7);
        average(1, 6, -2, 4);
        average(10, 30, 3, -4, 6);

        int[] arr = { 3, 6, -1, 4, 77, 99 };
        System.out.println(averageArray(arr));
        // this can work but we dont want it to be this way
    }

    public static double averageArray(int[] arr) {
        int total = 0;
        for (int el : arr) {
            total += el;
        }
        return (double) total / arr.length;
    }

    // with this method argument, you can receive any number you want of int
    // int... is also an array of integers, but it means this, whoever want to call
    // this method, is free to either send an array of integers, or just numbers,
    // if just numbers will be sent, then the method itself will create an array and
    // put them inside an array
    public static double average(int... arr) {
        int total = 0;
        for (int el : arr) {
            total += el;
        }
        return (double) total / arr.length;
    }

    // Note: if you want to add other arguments to the method, they should be
    // added before the int... arr, otherwise you will get an error
}

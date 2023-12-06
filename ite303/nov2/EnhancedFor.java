package nov2;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int num : arr) {
            System.out.println(num);
        }

        // has limitations, for example you want to multiply the array by two

        for (int num : arr) {
            num = num * 2;
        }

        for (int num : arr) {
            System.out.println(num);
        }

        // we cant modify the array using enhances forloop, so we have to use the
        // regular one

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] *= 2;
        }
    }

}

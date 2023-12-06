package nov2;

public class PassByRefrenceVsValue {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        processInt(arr[0]);
        System.out.println(arr[0]); // the value stays as 1 and doesnt
        // change because youre creating a copy and modifying the copy
        // but not the original array

        processArray(arr);
        System.out.println(arr[0]); // becomes 2, now we notice that the actualy array
        // has changed because we passed by refrence, basically we refrenced
        // the object of array

        // if you want to modify the original using primitiv type then do the following
        arr[0] = processIntChange(arr[0]);

    }

    public static void processArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] *= 2;
        }
    }

    public static void processInt(int x) {
        x = x * 2;
    }

    public static int processIntChange(int x) {
        return x = x * 2;
    }
}

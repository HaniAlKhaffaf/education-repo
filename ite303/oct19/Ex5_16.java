package oct19;

public class Ex5_16 {
    public static void main(String[] args) {
        System.out.println(isMultiple(20, 5));
    }

    public static boolean isMultiple(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else
            return false;

        // or we can just use something like the line below instead
        // return num1 % num2 == 0
    }
}

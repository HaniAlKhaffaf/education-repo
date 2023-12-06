package oct22;

public class Excercises {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.printf("%d --> ", number);
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        } else
            return false;
    }
}

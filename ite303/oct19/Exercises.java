package oct19;

import java.security.SecureRandom;

public class Exercises {
    public static void main(String[] args) {
        // Write statements that assign a ranomd number to the following int
        SecureRandom sr = new SecureRandom();
        // int n = ? + ? * sr.nextInt(???);
        // a) 1 <= n <= 2
        int a = 1 + 1 * sr.nextInt(2);
        // b) 1 <= n <= 100
        int b = 1 + 1 * sr.nextInt(100); // 1 - 100 inclusive
        // c) 0 <= n <= 9
        int c = 0 + 1 * sr.nextInt(10);
        // d) 1000 <= n <= 1112
        int d = 1000 + 1 * sr.nextInt(113);
        // e) -1 <= n <= 1
        int e = -1 + 1 * sr.nextInt(3);
        // f) -3 <= n <= 11
        int f = -3 + 1 * sr.nextInt(15);

        // Write statmeents that will have the following numbers
        // not sure of these below btw, should check

        // 3, 5, 7, 9, 11
        int g = 3 + 2 * sr.nextInt(5);
        // 6, 10, 14, 18, 22
        int u = 6 + 4 * sr.nextInt(5);
    }
}

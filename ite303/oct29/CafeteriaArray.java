package oct29;

public class CafeteriaArray {
    public static void main(String[] args) {

        /*
         * We already have an array that has filled ratings, we want to basically
         * count how much of each rating we have
         */

        int[] ratings = { 3, 5, 2, 3, 5, 2, 1, 2, 4, 1, 4, 2, 5, 1, 2, 4, 5, 1, 2, 3, 2, 1, 5, 2, 1, 3, 4, 1, 2, 4 };
        int[] freq = new int[6];

        for (int idx = 0; idx < ratings.length; idx++) {
            freq[ratings[idx]]++;
        }

        for (int rating = 1; rating < freq.length; rating++) {
            System.out.printf("%d\t%d%n", rating, freq[rating]);
        }
    }
}

package sep28;

public class ForLoop {
    public static void main(String[] args) {
        // for loop mainly for counter controlled
        // while loops are usually used for sentinal loop

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // odd numbers
        for(int counter = 1; counter <= 99; counter += 2) {
            System.out.println(counter + " ");
        }

        // sum of odd numbers
        int sum = 0;
        for(int counter = 1; counter <= 99; counter += 2) {
            sum += counter;
        }
        System.out.println(sum);

        // inversed for loop
        for(int i = 9; i >=1; i--) {
            System.out.println(i);
        }

        // practice for loops like for(i = 7; i<77; i+=7)

    }
}
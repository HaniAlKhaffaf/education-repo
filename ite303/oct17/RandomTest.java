package oct17;

import java.security.SecureRandom;

public class RandomTest {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        int randomNumber1 = sr.nextInt(6); // The maximum will be 0 all the way to argument - 1, the argument is called
                                           // scalling factor
        // so in this case we will get 0,1,2,3,4,5
        int randomNumber2 = sr.nextInt(6) + 1; // now we are going from 1-6, just like a die

        for (int counter = 1; counter <= 50; counter++) {
            int randomNumber3 = sr.nextInt(6) + 1;
        }

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        for (int i = 1; i <= 6000; i++) {
            int face = sr.nextInt(6) + 1;
            if (face == 1)
                counter1++;
            if (face == 2)
                counter2++;
            if (face == 3)
                counter3++;
            if (face == 4)
                counter4++;
            if (face == 5)
                counter5++;
            if (face == 6)
                counter6++;
        }
        System.out
                .println(counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " " + counter5 + " " + counter6);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        /*
         * Scalling factor --> the number of possible outcomes basically the arguemnet
         * we pass
         * shifting value --> the minimum possible value,
         * Difference between value --> increase by what
         */

        int randomNumber5 = sr.nextInt(counter6); // try to solve examples of Scalling factor, shifting value and
                                                  // differenceBetweenValue (in oct19 it is found)
    }
}

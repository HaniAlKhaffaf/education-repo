package oct12;

public class Pi {
    public static void main(String[] args) {

        
        // double pi = 0;
        // int posneg;
        // boolean sign = true;

        // for(int i = 1; i <= 1000*10; i++) {

            

        //     if (sign) {
        //         posneg = 1;
        //     } else posneg = -1;

        //     pi = pi * posneg * 4.0 / (2*i-1);

        //     if(sign){
        //         sign = false;
        //     } else sign = true;
            
        // }
        // System.out.println(pi);

        // my way did not work


        // Dr alans way

        double pi = 0;
        int sign = 1;
        for (int term=1; term <= 1000*200; term++){
            pi = pi + sign * 4.0 / (2*term-1);
            sign = sign * -1;
        }
        System.out.println(pi);
    }
}

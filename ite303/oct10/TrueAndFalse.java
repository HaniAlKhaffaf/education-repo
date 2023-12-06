package oct10;

public class TrueAndFalse {

    // Check teh AND and OR table for true and false
    // || --> OR (two bars)
    // && --> AND (two ampercent)

    
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        // AND
        if(x==1 && y==2) 
            System.out.println("hello");

        // OR
        if(x==1 || y==2)
            System.out.println("Hi");


        // AND and OR are not essential in Java, you can get the same output using a different way

        // for AND
        if(x == 1) {
            if(y == 2) {
                System.out.println("Hello");
            }
        }

        // for OR
        if(x == 1) {
            System.out.println("Hello");
        } else if(y == 2) {
                System.out.println("Hello");
            }
        

        // You can use a single one like & or |, if you use this
        // then java wont have to double check, it will only check first operation first, if its correct
        // then it will go to the second one, otherwise, if teh first operation is wrong, it will
        // immediatly terminate the code
    }
}

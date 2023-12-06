package oct10;

public class BreakTest {

    // You can only use break in two situations, 1-Loop 2-Switch, otherwise you will get an error
    // a developer can do all of his job without the need of using break or continue, its just
    // used for convenience 
    public static void main(String[] args) {
        System.out.println("Loop 1");
        for(int counter = 1; counter <=5; counter++) {
            if(counter == 3)
                break;
            System.out.printf("%d %n", counter);
        }

        System.out.println("Loop 2");
        for(int counter = 1; counter <= 5; counter++){
            if(counter == 3)
                continue;
            System.out.printf("%d %n", counter);
        }
    }
}

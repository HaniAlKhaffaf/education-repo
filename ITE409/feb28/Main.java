package feb28;
public class Main {
    public static void main(String arg[]){

        int x = 100;
        int y = 0;

        A a = new A();
        // a = null;
        a.test();

        // Methods throw exception in hierarchy, if main calls method test
        // and test has the error, then test will throw error to main and
        // then main will throw the error to the user, we can catch it either
        // in the main or the test, best practice is keep it in nested

        try {
            a.test();
            // System.out.println("result");
            System.out.println(x/y); 
            // since there is an error on the line above, then the execution
            // will stop and wont print the line below, basically the first
            // error in try, the code in try will stop and move to catch
            System.out.println("end");
        }catch(ArithmeticException e) {
            // you can use Exception class instead of ArithmeticException
            // because Exception is a father class of ArithmeticException
            // and similar exceptions, so it can find all types of 
            // Exceptions in your code.
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
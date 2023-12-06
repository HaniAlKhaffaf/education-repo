package oct17;

public class ScopeTest {
    static int x = 20; // a global variable --> the scope of global variables are the entire class

    public static void main(String[] args) {
        // local variable are variables declared insdie methods

        // System.out.println(x); // will have error

        System.out.println(x); // global variable is printed
        int x = 1; // local variable
        System.out.println(x); // local variable is printed

        // The local variable overshadows the global variables
    }
}
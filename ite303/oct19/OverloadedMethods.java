package oct19;

public class OverloadedMethods {
    public static void main(String[] args) {
        square(4);
        square(4.5);
    }

    // what is the advantage of overloading instead of giving different names
    public static int square(int x) {
        return x * x;
    }

    // What is a signature of a method? these make the method unique
    // 1- The name of the method
    // 2- The count of parameters
    // 3- The type
    // 4- The order of parameters
    // doesnt care about the return type btw

    // so overloaded methods are 2 or more methods with the same name but different
    // properties

    public static double square(double x) {
        return x * x;
    }
}

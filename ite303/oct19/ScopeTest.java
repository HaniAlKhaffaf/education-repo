package oct19;

public class ScopeTest {
    static int x = 1;

    public static void main(String[] args) {
        useGlobal();
    }

    public static void useLocal() {
        int x = 10;
        x++;
        System.out.println(x);
    }

    public static void useGlobal() {
        x++;
        System.out.println(x);
    }
}
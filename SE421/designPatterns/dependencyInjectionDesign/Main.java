package designPatterns.dependencyInjectionDesign;

public class Main {
    public static void main(String[] args) {
        Bankservice b = new ByblosBank();
        DBUtil d = new OracleDB();

        ProcessManager pm = new ProcessManager(b, d);
    }
}

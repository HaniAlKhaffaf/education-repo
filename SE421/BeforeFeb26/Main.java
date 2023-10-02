package BeforeFeb26;
public class Main {
    public static void main(String args[]) {
        int[] ids = new int[100];
        float[] gpas = new float[ids.length];
        String[] names = new String[ids.length];

        input(ids, gpas, names);
        print(ids, gpas, names);
    }

    public static void input(int[] ids, float gpas[], String names[]) {
        for(int i=0; i < ids.length; i++) {
            System.out.println(ids);
        }
        for(int i=0; i < gpas.length; i++) {
            System.out.println(gpas);
        }
    }
    public static void print(int[] ids, float gpas[], String names[]) {
        for(int i=0; i < ids.length; i++) {
            System.out.println(ids);
        }
        for(int i=0; i < gpas.length; i++) {
            System.out.println(gpas);
        }
        for(int i=0; i < names.length; i++) {
            System.out.println(names);
        }
    }
}

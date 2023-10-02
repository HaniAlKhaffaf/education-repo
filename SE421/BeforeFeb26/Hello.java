package BeforeFeb26;
public class Hello {
    public static void main(String[] args) {

        //Unstructured
        System.out.println("AUIS");
        System.out.println("Hello");
        System.out.println("AUIS");
        System.out.println("AUIS");
        System.out.println("AUIS");
        System.out.println("AUIS");

        //Structured

                System.out.println("AUIS");
        print("Hello");
        print("AUIS");
        print("AUIS");
        print("AUIS");
        print("AUIS");

    }

    //Structured way
    public static void print(String arg1) {
        System.out.print("SE421" + arg1);
    }

}
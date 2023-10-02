public class Person {
    
    public String name;
    public String phone;
    public Person() {
        name = "";
        phone = "";
    }

    public void print() {
        System.out.print("NAME: " + this.name);
        System.out.print("PHONE: " + this.phone);
    }
}

public class Student {
    public int id;
    public float gpa;

    public void print() {
        System.out.println("ID is changed to " + this.id);
    }

    public void setId(int id) {
        this.id = id;
        print();
    }

    public void setId() {
        id = 0;
        print();
    }


    // static methods you can call them without the need of calling an object

}

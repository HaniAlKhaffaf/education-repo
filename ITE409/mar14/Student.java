package mar14;
import java.io.Serializable;

// Interface are ones that create methods that forces the class to have the same 
// method in that class, so the class that implements an interface, it has to have,
// the exact method name and signature, but we can put the content however we want
// in the class that implemented the interface, a class can implement multiple,
// interfaces

// Serializable is an interface that is used only to catergorize the class and
// act as a class that will allow its objects to be stored inside a file

public class Student implements Serializable {
    public int id;
    public String name;
    public Department dept;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
